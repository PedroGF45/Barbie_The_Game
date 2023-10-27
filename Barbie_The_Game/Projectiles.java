import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Projectiles extends Actor
{
    private int speed;
    private int direction;
    
    // If projectile is at the edge, remove it
    public void wallCollision(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
