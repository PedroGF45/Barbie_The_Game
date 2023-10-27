import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Enemy
{ 
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveVertically();
        moveHorizontally();
        moveAtEdge();
    }
    
    public Snake()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    
    // @override
    public void moveVertically()
    {
        if (getWorld() instanceof Fight)
        {
            if (Greenfoot.getRandomNumber(50) < 3)
            {
                turn(Greenfoot.getRandomNumber(30)-15);
            }
            move(speed + 1);
        }
    }
}
