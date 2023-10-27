import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ShirtK extends KenObjects
{
    private GreenfootImage[] shirt;

    public void act()
    {
        transport();
        transport2();
    }
    public ShirtK(){
        shirt= new GreenfootImage[1];
        shirt[0]= new GreenfootImage("images/Roupas/camisaK.png");
        shirt[0].scale(shirt[0].getWidth()/15, shirt[0].getHeight()/15);
        setImage(shirt[0]);
    }
}
