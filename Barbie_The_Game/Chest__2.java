import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Chest__2 extends Chest
{
    private int count;
    
    public void act()
    {
        saveItems();
    }
    
    private void saveItems(){
        if(isTouching(KenObjects.class)){
            count++;
            if(isTouching(KenObjects.class)){
                removeTouching(KenObjects.class);
            }
            setImage(chest[1+count]);
        }
    }
}
