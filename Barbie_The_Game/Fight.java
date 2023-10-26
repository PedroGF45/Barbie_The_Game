import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fight extends World
{
    private int phase = 1;

    private Time time;
    private Score score;
    private Health barbieHealth;
    private Barbie barbie;
    private Health kenHealth;
    private Ken ken;

    public Fight(Health barbieHealth, Barbie barbie, Health kenHealth, Ken ken, Score score, Time time)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        this.barbieHealth = barbieHealth;
        this.barbie = barbie;
        this.kenHealth = kenHealth;
        this.ken = ken;
        this.score = score;
        this.time = time;
        prepare();
    }
    
    public void act(){
        phaseTransition();
    }
    
    public void prepare()
    {
        //Health bossHealth = new Health(10);
        //addObject(bossHealth, 650, 50);
        //Boss boss = new Boss(bossHealth);
        //addObject(boss,650,200);
        addObject(time, 725, 775);
        
        // Add score
        addObject(score, getWidth()/2, 25);

        // Add Health bars and players
        addObject(barbieHealth, 110, 25);

        GreenfootImage barbieIcon = new GreenfootImage("../barbie.png");
        Picture barbieIconImg = new Picture(barbieIcon, 20);
        addObject(barbieIconImg, 190, 25);

        addObject(barbie,95,700); 

        addObject(kenHealth, 700, 25);

        GreenfootImage kenIcon = new GreenfootImage("../ken.png");
        Picture kenIconImg = new Picture(kenIcon, 15);
        addObject(kenIconImg, 620, 25);

        addObject(ken,725,75);
        
        addObject(new Spider(),620, 15);
        addObject(new Spider(),620, 350);
        addObject(new Spider(),620, 650);
        addObject(new Spider(),690, 150);
        addObject(new Spider(),690, 450);
        addObject(new Snake(),600, 170);
        addObject(new Snake(),610, 490);
        addObject(new Snake(),510, 410);
        addObject(new Gun(), 250, 50);
        addObject(new Gun(), 250, 650);
        
        PortalBoost portalBoost = new PortalBoost();
        addObject(portalBoost,getWidth()/2,getHeight()/2);
    }
    
    public Barbie getBarbie()
    {
        return barbie;
    }
    
    public Health getBarbieHealth()
    {
        return barbieHealth;
    }
    
    public Ken getKen()
    {
        return ken;
    }
    
    public Health getKenHealth()
    {
        return kenHealth;
    }
    
    public Score getScore()
    {
        return score;
    }
    
    public Time getTime()
    {
        return time;
    }
    
    public void spawnBoss(){
        Health bossHealth = new Health(10);
        addObject(bossHealth, 650, 50);
        Boss boss = new Boss(bossHealth);
        addObject(boss,700,100);
    }
    
    public void spawnPortal(){
        
    }
    
    public void phaseTransition(){
        bullet bullet = new bullet();
        if(phase == 1 && bullet.kills == 8){
            spawnBoss();
            phase++;
        }
        if(phase == 2 && bullet.kills == 9){
            spawnPortal();
            phase++;
        }
    }
}
