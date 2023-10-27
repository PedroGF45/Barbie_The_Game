import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chest__2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chest__2 extends Chest
{
    //private GreenfootImage[] chest;
    private int count;
    /**
     * Act - do whatever the Chest_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        saveItems();
    }
    /*public Chest__2(){
        chest = new GreenfootImage[7];
        
        chest[0]=new GreenfootImage("../Roupas/chestO.png");
        chest[1]=new GreenfootImage("../Roupas/chestC.png");
        chest[2]=new GreenfootImage("../Roupas/chestO_0.png");
        chest[3]=new GreenfootImage("../Roupas/chestO_1.png");
        chest[4]=new GreenfootImage("../Roupas/chestO_2.png");
        chest[5]=new GreenfootImage("../Roupas/chestO_3.png");
        chest[6]=new GreenfootImage("../Roupas/chestO_4.png");
        for(int i=0; i<7;i++){
            chest[i].scale(chest[i].getWidth()/10,chest[i].getHeight()/10);
        }
        setImage(chest[2]);
    }*/
    
    public void saveItems(){
        if(isTouching(KenObjects.class)){
            count++;
            if(isTouching(KenObjects.class)){
                removeTouching(KenObjects.class);
            }
            setImage(chest[1+count]);
            
        }
    }
}
