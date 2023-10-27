import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Options extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(new OptionsMenu(), new GreenfootSound("sounds/button.mp3"));
    }
    
    // constructor for options button
    public Options()
    {
        GreenfootImage optionBtn = getImage();
        Picture optionImg = new Picture(optionBtn, 10);
    }
}
