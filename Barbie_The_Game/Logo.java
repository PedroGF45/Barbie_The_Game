import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Logo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logo extends Button
{
    public Logo()
    {
        GreenfootImage logoBtn = getImage();
        logoBtn.scale(logoBtn.getWidth()/6, logoBtn.getHeight()/6);
        setImage(logoBtn);
    }
}
