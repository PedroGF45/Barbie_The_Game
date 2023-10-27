import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Projectiles
{
    private int speed = 20;
 
    public void act()
    {
        move(speed);
        bulletCollision();
    }
    
    // Method to deal with bullet collisions
    private void bulletCollision(){
        if(isTouching(Bird.class)){
            removeTouching(Bird.class);
            increaseAndRemove(this); 
        }else if(isTouching(Snake.class)){
            removeTouching(Snake.class);
            increaseAndRemove(this); 
        }else if(isTouching(Spider.class)){
            removeTouching(Spider.class);
            increaseAndRemove(this); 
        }
        else{
            wallCollision();
        }
    }
    
    // increase kills and remove bullet
    private void increaseAndRemove(Bullet bullet)
    {
        ((Fight)getWorld()).increaseKills();
        getWorld().removeObject(bullet);
    }

}
