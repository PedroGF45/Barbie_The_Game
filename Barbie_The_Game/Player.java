import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;

public class Player extends Actor
{
    private int speed = 4;
    private int contImag;
    private int tamanho = 13;
    private Health health;
    private int ownsGun = 0;
    private int projr;
    private boolean cooldown = false;
    Timer timer = new Timer();
    
    // Constructor for player
    public Player(Health health)
    {
        this.health = health;
    }
        
    public void mover(String botao1, String botao2, String botao3, String botao4,GreenfootImage[] esquerda, GreenfootImage[] direita,GreenfootImage[] repouso )
    {
        int x=getX();
        int y=getY();
        
        // Detecção de colisões para cada direção de movimento
        boolean collisionUp = isTouchingWalls() && Greenfoot.isKeyDown(botao2);
        boolean collisionDown = isTouchingWalls() && Greenfoot.isKeyDown(botao3);
        
        //move to the left
        if(Greenfoot.isKeyDown (botao1))
        {
            move(-speed);
            if (isTouchingWalls()) move(speed);
            //setLocation(x-speed, y);
            animacao(esquerda);
            projr = 180;
        }
        //move to the right
        else if(Greenfoot.isKeyDown (botao4))
        {
            move(speed);
            if (isTouchingWalls()) move(-speed);
            //setLocation(x+speed, y);
            animacao(direita);
            projr = 0;
        }
        // move up
        else if(Greenfoot.isKeyDown (botao2) && !collisionUp)
        {
            //move(speed);
            setLocation(x, y-speed);
            if (isTouchingWalls()) setLocation(x, y+speed);
            animacao(esquerda);
            projr = -90;
        }
        //move down
        else if(Greenfoot.isKeyDown (botao3)&& !collisionDown)
        {
            //move(speed);
            setLocation(x, y+speed);
            if (isTouchingWalls()) setLocation(x, y-speed);
            animacao(direita);
            projr = 90;
        }
        else if(Greenfoot.getKey() == null)
        {
            setImage(repouso[0]);
        }
    }
    
    // Animation sequence for images
    public void animacao(GreenfootImage[] seqImagens){
        contImag++;
        Greenfoot.delay(2);
        if(contImag>9){
            contImag=0;
        }
        setImage(seqImagens[contImag]);
    }
    // Scale images for the animation
    public void escala(GreenfootImage[] seqImaTam){
        for(int i=0;i< seqImaTam.length ;i++){
            seqImaTam[i].scale(seqImaTam[i].getWidth()/tamanho,seqImaTam[i].getHeight()/tamanho);
            setImage(seqImaTam[i]);
        }
    }
    
    // Check if player is touching the walls
    public boolean isTouchingWalls()
    {
        return isTouching(Square.class);
    }
    
    // Check if player is touching a speed boost
    public void hitSpeedBoost()
    {
        if (isTouching(SpeedBoost.class))
        {
            if (speed <=5) 
            {
                speed++;
                removeTouching(SpeedBoost.class);
            }     
        }
    }
    
    // Check if player is touching a life boost
    public void hitLifeBoost()
    {
        if (isTouching(LifeBoost.class))
        {
            if (health.getHealth() < 5) 
            {
                health.gainLife();
                removeTouching(LifeBoost.class);
            }     
        }
    }
    
    // Check if player is touching a portal
    public boolean ishittingPortal()
    {
        if (isTouching(Portal.class))
        {
            return true;
        }
        return false;
    }
    
    // Lose life method
    public void loseHealth()
    {
        if (isTouchingEnemy() || isTouching(Rock.class)) {
            // play sound when dies
            GreenfootSound death = new GreenfootSound("sounds/death.mp3");
            death.setVolume(50);
            death.play();
            
            // lose 1 heart
            health.loseLife();
        }
    }
    
    // Check if player is touching an enemy
    public boolean isTouchingEnemy()
    {
        return isTouching(Enemy.class);
    }
    
    public boolean isTouchingRock()
    {
        return isTouching(Rock.class);
    }
      
    // Lose game method
    public void lostGame()
    {
        if (health.getHealth() == 0) 
        {
            World world = getWorld();
            if (world instanceof Maze)
            {
                // Retrieve Barbie and Ken from the maze world
                Score score = ((Maze) getWorld()).getScore();
                Time time = ((Maze) getWorld()).getTime();
                Greenfoot.setWorld(new LostGame(world, score, time));
            }
            else if (world instanceof Fight)
            {
                // Retrieve Barbie and Ken from the fight world
                Score score = ((Fight) getWorld()).getScore();
                Time time = ((Fight) getWorld()).getTime();
                Greenfoot.setWorld(new LostGame(world, score, time));
            }
        }
    }
    
    // win game method
    public void wonGame()
    {
        World world = getWorld();        
        if (world instanceof Fight)
        {
            Score score = ((Fight) getWorld()).getScore();
            Time time = ((Fight) getWorld()).getTime();
            if (score.getPortals() == 3)
            {
                Greenfoot.setWorld(new WonGame(score, time));
            }            
        }
    }
    
    // Check if player is touching a gun
    public void isTouchingGun()
    {
        if(isTouching(Gun.class) && ownsGun == 0){
            removeTouching(Gun.class);
            ownsGun = 1;
        }
    }
    
    // Shoot method for the player
    public void shoot(String key){
        if(ownsGun == 1 && Greenfoot.isKeyDown(key) && cooldown==false){
            World world = getWorld();
            Bullet bullet1 = new Bullet();
            world.addObject(bullet1,getX(),getY());
            bullet1.setRotation(projr);
            cooldown = true;
            timer.schedule(new TimerTask(){public void run(){cooldown = false;}}, 1600);
            GreenfootSound gunshot = new GreenfootSound("sounds/pistol.wav");
            gunshot.setVolume(67);
            gunshot.play();
        };
    }
    
    @Override
    public void setLocation(int x, int y){
        if (Greenfoot.isKeyDown("space")){
            Actor actor= getOneIntersectingObject(KenObjects.class );
            Actor actor1= getOneIntersectingObject(BarbieObjects.class);
            if(actor != null){
                actor.setLocation(actor.getX()+(x-getX()) , actor.getY()+(y-getY()));//coloca o objeto na mesma localização do ator
            }
            if(actor1 != null){
                actor1.setLocation(actor1.getX()+(x-getX()) , actor1.getY()+(y-getY()));//coloca o objeto na mesma localização do ator
            }
        }
        super.setLocation(x,y); //para que nao haja recursao da função original de setLocation
    }
}
