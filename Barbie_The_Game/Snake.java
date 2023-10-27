import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Snake extends Enemy
{ 
    public void act()
    {
        moveVertically();
        moveHorizontally();
        moveAtEdge();
    }
    
    // Constructor for the Snake
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
