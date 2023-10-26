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
    /**
     * Act - do whatever the bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        bulletCollision();
    }
    
    public Bullet(){
        
    }
    
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
    
    private void increaseAndRemove(Bullet bullet)
    {
        ((Fight)getWorld()).increaseKills();
        getWorld().removeObject(bullet);
    }

}
