import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Enemy
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveVertically();
        moveAtEdge();
    }
    
    public Spider()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    
        public void moveVertically()
    {
        if (getWorld() instanceof Fight)
        {
            if (Greenfoot.getRandomNumber(50) == 0)
            {
                turn((Greenfoot.getRandomNumber(9)-4)*45);
            }
            move(speed + 2);
        }
        else{
            if (isTouchingWall())
            {
            changeSpeed();
            }
            setRotation(90);
            move(speed);
        }
    }
}
