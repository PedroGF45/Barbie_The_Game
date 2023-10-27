import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BarbieObjects extends Actor
{
    public void transport(){
        if(isTouching(Hole_1.class)){
            this.setLocation( 500,600);
        }
    }
    public void transport2(){
        if(isTouching(Hole_2.class)){
            this.setLocation( 200, 600);
        }
    }
}
