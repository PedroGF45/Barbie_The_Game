import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;

public class Player extends Actor
{
    private int speed = 5;
    private int contImag;
    public int tamanho = 13;
    private String key = Greenfoot.getKey();  
    private Health health;
    private int ownsGun = 0;
    public int projr;
    Timer timer = new Timer();
    public boolean cooldown = false;
    
    public Player(Health health)
    {
        this.health = health;
    }
    
    public void act()
    {
    }
    
    public void mover(String botao1, String botao2, String botao3, String botao4,GreenfootImage[] esquerda, GreenfootImage[] direita,GreenfootImage[] repouso )
    {
        int x=getX();
        int y=getY();
        
        //mover para a esquerda
        if(Greenfoot.isKeyDown (botao1))
        {
            move(-speed);
            if (isTouchingWalls()) move(speed);
            //setLocation(x-speed, y);
            animacao(esquerda);
            projr = 180;
        }
        // mover para cima
        else if(Greenfoot.isKeyDown (botao2))
        {
            //move(speed);
            setLocation(x, y-speed);
            if (isTouchingWalls()) setLocation(x, y+speed);
            animacao(esquerda);
            projr = -90;
        }
        //mover para baixo
        else if(Greenfoot.isKeyDown (botao3))
        {
            //move(speed);
            setLocation(x, y+speed);
            if (isTouchingWalls()) setLocation(x, y-speed);
            animacao(direita);
            projr = 90;
        }
        //mover para a direita
        else if(Greenfoot.isKeyDown (botao4))
        {
            move(speed);
            if (isTouchingWalls()) move(-speed);
            //setLocation(x+speed, y);
            animacao(direita);
            projr = 0;
        }
        //if(key==null){
        else 
        {
            setImage(repouso[0]);
        }
    }
    
    //sequencia de animações andar/morte
    public void animacao(GreenfootImage[] seqImagens){
        contImag++;
        Greenfoot.delay(2);
        if(contImag>9){
            contImag=0;
        }
        setImage(seqImagens[contImag]);
    }
    //mudar o tamanho da sequencia de imagens de animações
    public void escala(GreenfootImage[] seqImaTam){
        for(int i=0;i< seqImaTam.length ;i++){
            seqImaTam[i].scale(seqImaTam[i].getWidth()/tamanho,seqImaTam[i].getHeight()/tamanho);
            setImage(seqImaTam[i]);
        }
    }
    
    public boolean isTouchingWalls()
    {
        return isTouching(Square.class);
    }
    
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
    
    public void hitPortalBoost()
    {
        if (isTouching(PortalBoost.class))
        {
            Puzzle.score.gainPortal();
            removeTouching(PortalBoost.class);
            
            World currentWorld = getWorld();
            if (currentWorld instanceof Puzzle)
            {
                Greenfoot.setWorld(new Maze());
            }
            else if (currentWorld instanceof Maze)
            {
                Greenfoot.setWorld(new Fight());
            }
        }
    }
    
    public void updateHealth()
    {
        if (isTouchingEnemy() || isTouching(rock.class)) {
            health.loseLife();
        }
    }
    
    public boolean isTouchingEnemy()
    {
        return isTouching(Enemy.class);
    }
    
    public void isLost()
    {
        if (health.hearts == 0) 
        {
            System.out.print("You Lose");
            Maze newMaze = new Maze();
            Greenfoot.setWorld(newMaze);
        }
    }
    
    public void isTouchingGun()
    {
        if(isTouching(Gun.class) && ownsGun == 0){
            removeTouching(Gun.class);
            ownsGun = 1;
        }
    }
    
    public void shoot(String key){
        if(ownsGun == 1 && Greenfoot.isKeyDown(key) && cooldown==false){
            World world = getWorld();
            bullet bullet1 = new bullet();
            world.addObject(bullet1,getX(),getY());
            bullet1.setRotation(projr);
            cooldown = true;
            timer.schedule(new TimerTask(){public void run(){cooldown = false;}}, 1600);
        };
    }
}
