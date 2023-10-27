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
        GreenfootSound hit = new GreenfootSound("sounds/bullet_hit.mp3");
        hit.setVolume(67);
        if(isTouching(Bird.class)){
            hit.play();
            removeTouching(Bird.class);
            getWorld().removeObject(this);
            kills++;
        }else if(isTouching(Snake.class)){
            hit.play();
            removeTouching(Snake.class);
            getWorld().removeObject(this);
            kills++;
        }else if(isTouching(Spider.class)){
            hit.play();
            removeTouching(Spider.class);
            getWorld().removeObject(this);
            kills++;
        }
        else{
            wallCollision();
        }
    }
}
