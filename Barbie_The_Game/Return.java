import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Return extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(getBtnSound());
    }
    
    // constructor for return button
    public Return()
    {
        GreenfootImage returnBtn = getImage();
        Picture returnImg = new Picture(returnBtn, 10);
    }
}
