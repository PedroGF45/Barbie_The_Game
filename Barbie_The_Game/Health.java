import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    public int hearts, maxHearts;
    
    GreenfootImage heart = new GreenfootImage("../heart.png");
      
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public void updateLife(GreenfootImage heart) {
        int x = heart.getWidth();
        int y = heart.getHeight();
        GreenfootImage image = new GreenfootImage(x * maxHearts, y);
        for (int i = 0; i < hearts; i++)
        {
            image.drawImage(heart, i*x, 0);
        }
        setImage(image);
    }
    
    public Health(int units)
    {
        hearts = units;
        maxHearts = units;
        heart.scale(20,20); 
        updateLife(heart);
    }
    
    public int getHealth() 
    {
        return hearts;
    }
    
    public void loseLife() 
    {
        hearts--;
        updateLife(heart);
    }
    
    public void gainLife() 
    {
        hearts++;
        updateLife(heart);
    }
    
}
