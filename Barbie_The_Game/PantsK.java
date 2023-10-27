import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PantsK extends KenObjects
{
    private GreenfootImage[] pants;
    
    public void act()
    {
        transport();
        transport2();
    }
    public PantsK(){
        pants= new GreenfootImage[1];
        pants[0]= new GreenfootImage("images/Roupas/calcasK.png");
        pants[0].scale(pants[0].getWidth()/20, pants[0].getHeight()/20);
        setImage(pants[0]);
    }
}
