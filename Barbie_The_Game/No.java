import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class No extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(getBtnSound());
    }
    
    // constructor for no button
    public No()
    {
        GreenfootImage noBtn = getImage();
        Picture noImg = new Picture(noBtn, 10);
    }
}
