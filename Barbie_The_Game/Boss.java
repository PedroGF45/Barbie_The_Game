import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.TimerTask;
import java.util.Timer;

public class Boss extends Enemy
{
    private int bossSize = 2;
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
        move(getSpeed());
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
            GreenfootSound hit = new GreenfootSound("sounds/bullet_hit.mp3");
            hit.setVolume(67);
            hit.play();
            health.loseLife();
            removeTouching(Bullet.class);
        }
    }
    
    // Check if boss is dead
    public void dead(){
        if(health.getHealth() == 0){
            Bullet bullet = new Bullet();
            ((Fight)getWorld()).increaseKills();
            getWorld().removeObject(this);
        }
    }
    
    // Move the boss towards the player
    public void moveTowardsPlayer(){
        turnTowards(target.getX(), target.getY());
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
