import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spider extends Enemy
{
    public void act()
    {
        moveVertically();
        moveAtEdge();
    }
    
    // Constructor for the Spider
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
            move(getSpeed() + 2);
        }
        else{
            if (isTouchingWall())
            {
            changeSpeed();
            }
            setRotation(90);
            move(getSpeed());
        }
    }
}
