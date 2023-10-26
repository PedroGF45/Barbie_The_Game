import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Projectiles
{
    private int speed = 20;
    public static int kills = 0;
    /**
     * Act - do whatever the bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        bulletCollision();
    }
    
    public bullet(){
        
    }
    
    public void bulletCollision(){
        if(isTouching(Bird.class)){
            removeTouching(Bird.class);
            getWorld().removeObject(this);
            kills++;
        }else if(isTouching(Snake.class)){
            removeTouching(Snake.class);
            getWorld().removeObject(this);
            kills++;
        }else if(isTouching(Spider.class)){
            removeTouching(Spider.class);
            getWorld().removeObject(this);
            kills++;
        }
        else{
            wallCollision();
        }
    }
}
