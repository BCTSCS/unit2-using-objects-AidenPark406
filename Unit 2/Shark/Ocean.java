import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FastFish fastFish = new FastFish();
        addObject(fastFish,140,143);
        Shark baby = new Shark("Baby", 10);
        Shark mommy = new Shark("Mommy", 13);
        Shark daddy = new Shark("Daddy", 16);

        addObject(baby,509,112);
        addObject(mommy,209,312);
        addObject(daddy,409,512);

        SlowFish slowFish = new SlowFish();
        addObject(slowFish,324,220);
    }
}
