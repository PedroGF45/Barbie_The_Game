import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Barbie extends Player
{
    private GreenfootImage[] esquerda, direita, morte, repouso;
    
    public void act()
    {
        mover("a", "w", "s", "d", esquerda, direita, repouso);
        shoot("Space");
        hitSpeedBoost();
        hitLifeBoost();
        lostGame();
        wonGame();
        ishittingPortal();
        isTouchingGun();
        loseHealth();
        respawn();
    }
    
    // Constructor for Barbie
    public Barbie(Health health)
    {
        super(health);
        
        esquerda= new GreenfootImage[10];
        direita= new GreenfootImage[10];
        morte= new GreenfootImage[10];
        repouso=new GreenfootImage[1];
        
        //imagens esquerda
        esquerda[0]=new GreenfootImage("../Animacoes/Run_000e.png");
        esquerda[1]=new GreenfootImage("../Animacoes/Run_001e.png");
        esquerda[2]=new GreenfootImage("../Animacoes/Run_002e.png");
        esquerda[3]=new GreenfootImage("../Animacoes/Run_003e.png");
        esquerda[4]=new GreenfootImage("../Animacoes/Run_004e.png");
        esquerda[5]=new GreenfootImage("../Animacoes/Run_005e.png");
        esquerda[6]=new GreenfootImage("../Animacoes/Run_006e.png");
        esquerda[7]=new GreenfootImage("../Animacoes/Run_007e.png");
        esquerda[8]=new GreenfootImage("../Animacoes/Run_008e.png");
        esquerda[9]=new GreenfootImage("../Animacoes/Run_009e.png");
        //imagens direita
        direita[0]=new GreenfootImage("../Animacoes/Run_000.png");
        direita[1]=new GreenfootImage("../Animacoes/Run_001.png");
        direita[2]=new GreenfootImage("../Animacoes/Run_002.png");
        direita[3]=new GreenfootImage("../Animacoes/Run_003.png");
        direita[4]=new GreenfootImage("../Animacoes/Run_004.png");
        direita[5]=new GreenfootImage("../Animacoes/Run_005.png");
        direita[6]=new GreenfootImage("../Animacoes/Run_006.png");
        direita[7]=new GreenfootImage("../Animacoes/Run_007.png");
        direita[8]=new GreenfootImage("../Animacoes/Run_008.png");
        direita[9]=new GreenfootImage("../Animacoes/Run_009.png");
        //imagens morte
        morte[0]=new GreenfootImage("../Animacoes/Dead_000.png");
        morte[1]=new GreenfootImage("../Animacoes/Dead_001.png");
        morte[2]=new GreenfootImage("../Animacoes/Dead_002.png");
        morte[3]=new GreenfootImage("../Animacoes/Dead_003.png");
        morte[4]=new GreenfootImage("../Animacoes/Dead_004.png");
        morte[5]=new GreenfootImage("../Animacoes/Dead_005.png");
        morte[6]=new GreenfootImage("../Animacoes/Dead_006.png");
        morte[7]=new GreenfootImage("../Animacoes/Dead_007.png");
        morte[8]=new GreenfootImage("../Animacoes/Dead_008.png");
        morte[9]=new GreenfootImage("../Animacoes/Dead_009.png");
        //repouso
        repouso[0]=new GreenfootImage("../Animacoes/Idle_009.png");
        escala(esquerda);
        escala(direita);
        escala(morte);
        escala(repouso);
        setImage(repouso[0]);
    }
    
    // Respawn player if touching an enemy or a projectile from the enemy
    private void respawn() {
        World currentWorld = getWorld();
        if (isTouchingEnemy() || isTouching(Rock.class))
        {
            if (currentWorld instanceof Maze)
            {
               setLocation(((Maze)getWorld()).getCoordBarbie().getKey(), ((Maze)getWorld()).getCoordBarbie().getValue()); 
            }
            else if (currentWorld instanceof Fight)
            {
                setLocation(200, 600);
            }
        }
    }
}
