import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picture extends Actor
{

    // Add constructor to set an image
    public Picture(GreenfootImage img)
    {
        img.scale(img.getWidth()/10, img.getHeight()/10);
        setImage(img);
    }
        
}
