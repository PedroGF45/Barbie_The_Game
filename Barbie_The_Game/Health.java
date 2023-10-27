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
    
    // Constructor for Health
    public Health(int units)
    {
        hearts = units;
        maxHearts = units;
        heart.scale(20,20); 
        updateLife(heart);
    }
    
    // update image of health
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
    
    public int getHealth() 
    {
        return hearts;
    }
    
    // Lose life method
    public void loseLife() 
    {
        hearts--;
        updateLife(heart);
    }
    
    // Gain life method
    public void gainLife() 
    {
        hearts++;
        updateLife(heart);
    }
}
