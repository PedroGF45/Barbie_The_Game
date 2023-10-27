import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Picture extends Actor
{
    // Picture constructor to scale and set an image
    public Picture(GreenfootImage img, int scale)
    {
        img.scale(img.getWidth()/scale, img.getHeight()/scale);
        setImage(img);
    } 
}
