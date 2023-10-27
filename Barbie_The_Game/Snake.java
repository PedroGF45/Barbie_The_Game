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
            if (Greenfoot.getRandomNumber(10) < 3) // check if a random number between 0-9 is less than 5 (30% chance)
            {
                turn(5);
            }
            move(speed - 1);
        }
    }
}
