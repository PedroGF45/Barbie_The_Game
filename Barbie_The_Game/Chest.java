import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Chest extends Actor
{
    public GreenfootImage[] chest;
    public void act()
    {
        // Add your action code 
    }
    
    public Chest(){
        chest = new GreenfootImage[7];
        
        chest[0]=new GreenfootImage("../Roupas/chestO.png");
        chest[1]=new GreenfootImage("../Roupas/chestO_0.png");
        chest[2]=new GreenfootImage("../Roupas/chestO_1.png");
        chest[3]=new GreenfootImage("../Roupas/chestO_2.png");
        chest[4]=new GreenfootImage("../Roupas/chestO_3.png");
        chest[5]=new GreenfootImage("../Roupas/chestO_4.png");
        chest[6]=new GreenfootImage("../Roupas/chestC.png");
        for(int i=0; i<7;i++){
            chest[i].scale(chest[i].getWidth()/10,chest[i].getHeight()/10);
        }
        setImage(chest[1]);
    }
}