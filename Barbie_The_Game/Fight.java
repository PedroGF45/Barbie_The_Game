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
    private int kills = 0;
    private int bossHearts = 10;

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
    
    // Always check for phase transition
    public void act(){
        phaseTransition();
    }
    
    public void prepare()
    {
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        // Add time
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
        
        // Add enemies
        addObject(new Spider(),620, 15);
        addObject(new Spider(),620, 350);
        addObject(new Spider(),620, 650);
        addObject(new Spider(),690, 150);
        addObject(new Spider(),690, 450);
        addObject(new Snake(),600, 170);
        addObject(new Snake(),610, 490);
        addObject(new Snake(),510, 410);
        
        // Add guns
        addObject(new Gun(), 250, 50);
        addObject(new Gun(), 250, 650);
    }
    
    // Encapsulation methods
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
    
    // Spawn boss method
    public void spawnBoss(){
        Health bossHealth = new Health(bossHearts);
        addObject(bossHealth, getWidth()/2, 75);
        Boss boss = new Boss(bossHealth);
        addObject(boss,700,100);
    }
    
    // Spawn portal method
    public void spawnPortal(){
        PortalBoost portalBoost = new PortalBoost();
        addObject(portalBoost,getWidth()/2,getHeight()/2);
    }
    
    // Increase kills method
    public void increaseKills()
    {
        kills++;
    }
    
    // Get current number of kills
    public int getKills()
    {
        return kills;
    }
    
    // Method for the phase transition
    public void phaseTransition(){
        Bullet bullet = new Bullet();
        if(phase == 1 && getKills() == 8){
            spawnBoss();
            phase++;
        }
        if(phase == 2 && getKills() == 9){
            spawnPortal();
            phase++;
        }
    }
}
