import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bird extends Enemy
{
    public void act()
    {
        rotationMovement();
        moveAtEdge();
    }
    
    // Constructor for Bird
    public Bird()
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
}
