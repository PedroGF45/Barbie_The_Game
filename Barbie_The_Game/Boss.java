import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.TimerTask;
import java.util.Timer;

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    private int bossSize = 4;
    private int shiftcd = 0; //cooldown on target shifting
    private Player target;
    public Health health;
    Timer timer = new Timer();

    public void act()
    {
        chooseTarget();
        touchingBullet();
        dead();
        moveTowardsPlayer();
        throwRocks();
        move(speed);
    }
    
    // Constructor for Boss
    public Boss(Health health)
    {
        this.health = health;
        getImage().scale(getImage().getWidth() * bossSize, getImage().getHeight() * bossSize);
    }
    
    // Check if boss is being shot
    public void touchingBullet(){
        if(isTouching(Bullet.class)){
            health.loseLife();
            removeTouching(Bullet.class);
        }
    }
    
    // Check if boss is dead
    public void dead(){
        if(health.hearts == 0){
            Bullet bullet = new Bullet();
            ((Fight)getWorld()).increaseKills();
            getWorld().removeObject(this);
        }
    }
    
    // Move the boss towards the player
    public void moveTowardsPlayer(){
        if(Greenfoot.getRandomNumber(100) <= 39){
            turnTowards(target.getX(), target.getY());
        }
        else{
            turnTowards(target.getX(), target.getY());
            turn(Greenfoot.getRandomNumber(160)-80);
        }
    }
    
    // Method to add ability to the boss to throw rocks
    public void throwRocks(){
        if(Greenfoot.getRandomNumber(40) == 0){
            Rock rock = new Rock();
            getWorld().addObject(rock,getX(),getY());
            rock.turnTowards(target.getX(), target.getY());
        };
    }
    
    // Method to select the player to target randomly
    public void chooseTarget(){
        if(shiftcd == 0){
            if(Greenfoot.getRandomNumber(2) == 0){
                target = getWorld().getObjects(Barbie.class).get(0);
            }
            else{
                target = getWorld().getObjects(Ken.class).get(0);
            }
            shiftcd = 1;
            timer.schedule(new TimerTask(){public void run(){shiftcd = 0;}}, 4000);
        }
    }
}
