import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hole extends Actor
{
    public GreenfootImage[] hole;

    public Hole(){
        hole= new GreenfootImage[1];
        hole[0]= new GreenfootImage("images/hole.png");
        setImage(hole[0]);
    }
}
