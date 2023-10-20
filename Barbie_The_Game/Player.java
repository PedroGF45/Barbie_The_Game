import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int speed = 5;
    private int contImag;
    public int tamanho = 13;
    private String key = Greenfoot.getKey();  
    private Health health;
    
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
            
        }
        // mover para cima
        else if(Greenfoot.isKeyDown (botao2))
        {
            //move(speed);
            setLocation(x, y-speed);
            if (isTouchingWalls()) setLocation(x, y+speed);
            animacao(esquerda);
            
        }
        //mover para baixo
        else if(Greenfoot.isKeyDown (botao3))
        {
            //move(speed);
            setLocation(x, y+speed);
            if (isTouchingWalls()) setLocation(x, y-speed);
            animacao(direita);
            
        }
        //mover para a direita
        else if(Greenfoot.isKeyDown (botao4))
        {
            move(speed);
            if (isTouchingWalls()) move(-speed);
            //setLocation(x+speed, y);
            animacao(direita);
            
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
    
    public void updateHealth()
    {
        if (isTouchingEnemy()) {
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
}
