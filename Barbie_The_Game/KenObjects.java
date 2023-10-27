import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KenObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KenObjects extends Actor
{
    /**
     * Act - do whatever the KenObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public void transport(){
        if(isTouching(Hole_1.class)){
            this.setLocation( 500, 600);
        }
    }
    public void transport2(){
        if(isTouching(Hole_2.class)){
            this.setLocation( 200, 600);
        }
    }
}
