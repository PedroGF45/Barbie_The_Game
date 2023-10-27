import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chest__1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chest__1 extends Chest
{
    private int count;
    /**
     * Act - do whatever the Chest__1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        saveItem();
    }
    public void saveItem(){
        if(isTouching(BarbieObjects.class)){
            count++;
            if(isTouching(BarbieObjects.class)){
                removeTouching(BarbieObjects.class);
            }
            setImage(chest[1+count]);
            
        }
    }
}
