import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rock extends Projectiles
{
    private int speed = 8;
    
    public void act()
    {
        move(speed);
        wallCollision();
    }
}
