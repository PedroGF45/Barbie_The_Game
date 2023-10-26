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
    public Health health;
    private int shiftcd = 0; //cooldown on target shifting
    private Player target;
    Timer timer = new Timer();
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        chooseTarget();
        touchingBullet();
        dead();
        moveTowardsPlayer();
        throwRocks();
        move(speed);
    }
    
    public Boss(Health health)
    {
        this.health = health;
        getImage().scale(getImage().getWidth() * bossSize, getImage().getHeight() * bossSize);
    }
    
    public void touchingBullet(){
        if(isTouching(Bullet.class)){
            health.loseLife();
            removeTouching(Bullet.class);
        }
    }
    
    public void dead(){
        if(health.hearts == 0){
            Bullet bullet = new Bullet();
            ((Fight)getWorld()).increaseKills();
            getWorld().removeObject(this);
        }
    }
    
    public void moveTowardsPlayer(){
        if(Greenfoot.getRandomNumber(100) <= 39){
            turnTowards(target.getX(), target.getY());
        }
        else{
            turnTowards(target.getX(), target.getY());
            turn(Greenfoot.getRandomNumber(160)-80);
        }
    }
    
    public void throwRocks(){
        if(Greenfoot.getRandomNumber(20) == 0){
            rock rock = new rock();
            getWorld().addObject(rock,getX(),getY());
            rock.turnTowards(target.getX(), target.getY());
        };
    }
    
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
