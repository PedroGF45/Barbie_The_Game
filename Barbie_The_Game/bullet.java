import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        GreenfootSound hit = new GreenfootSound("sounds/bullet_hit.mp3");
        hit.setVolume(67);
        if(isTouching(Bird.class)){
            hit.play();
            removeTouching(Bird.class);
            increaseAndRemove(this); 
        }else if(isTouching(Snake.class)){
            hit.play();
            removeTouching(Snake.class);
            increaseAndRemove(this); 
        }else if(isTouching(Spider.class)){
            hit.play();
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
