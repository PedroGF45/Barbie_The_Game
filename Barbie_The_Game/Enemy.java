import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void moveAtEdge()
    {
        int x = getX();
        int y = getY();
        int worldWidth = getWorld().getWidth() - 1;
        int worldHeight = getWorld().getHeight() - 1;
        
        if (x >= worldWidth)
        {
            setLocation(1, y);
        }
        if (y >= worldHeight)
        {
            setLocation(y, 1);
        }
        if (x <= 0)
        {
            setLocation(worldWidth - 1, y);
        }
        if (y <= 0)
        {
            setLocation(x, worldHeight - 1);
        }
        
    }
    
    public void rotationMovement()
    {
        int x = getWorld().getWidth()/2;
        int y = getWorld().getHeight()/2;
        int speed = 5;
        turnTowards(x,y);
        int rotation = getRotation();
        setRotation(rotation + 89);
        move(speed);
    }
}
