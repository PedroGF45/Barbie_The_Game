import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarbieObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarbieObjects extends Actor
{
    /**
     * Act - do whatever the BarbieObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    /*public void saveItem(){
        if(isTouching(Chest__1.class)){
            if(getWorld()!=null){
                getWorld().removeObject(this);
            }
        }
    }*/
    public void transport(){
        if(isTouching(Hole_1.class)){
            this.setLocation( 500,600);
        }
    }
    public void transport2(){
        if(isTouching(Hole_2.class)){
            this.setLocation( 200, 600);
        }
    }
}
