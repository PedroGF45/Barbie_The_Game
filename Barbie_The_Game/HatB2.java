import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HatB2 extends BarbieObjects
{
    private GreenfootImage[] hatb2;
    public void act()
    {
        //saveItem();
        transport();
        transport2();
    }
    public HatB2(){
        hatb2= new GreenfootImage[1];
        hatb2[0]= new GreenfootImage("images/Roupas/chapeuB_2.png");
        hatb2[0].scale(hatb2[0].getWidth()/8, hatb2[0].getHeight()/8);
        setImage(hatb2[0]);
    }
}
