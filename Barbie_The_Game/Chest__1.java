import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Chest__1 extends Chest
{
    private int count;

    public void act()
    {
        saveItem();
    }
    
    private void saveItem(){
        if(isTouching(BarbieObjects.class)){
            count++;
            if(isTouching(BarbieObjects.class)){
                removeTouching(BarbieObjects.class);
            }
            setImage(chest[1+count]);
        }
    }
}
