import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    public int units = 5;
    private int maxUnits = 5;
    
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
        GreenfootImage image = new GreenfootImage(x * maxUnits, y);
        for (int i = 0; i < units; i++)
        {
            image.drawImage(heart, i*x, 0);
        }
        setImage(image);
    }
    
    public Health()
    {
        heart.scale(20,20); 
        updateLife(heart);
    }
    
    public void loseLife() {
        units--;
        updateLife(heart);
    }
    
    public void gainLife() {
        units++;
        updateLife(heart);
    }
    
}
