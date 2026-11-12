import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public MyWorld()
    {    
        super(768, 576, 1, false);

        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // seems to be the default
        prepare();
    }

    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Target Target = new Target();
        addObject(Target,554,187);
        Target target2 = new Target();
        addObject(target2,656,277);
        Target target3 = new Target();
        addObject(target3,633,410);
        Target.setLocation(559,121);
        target2.setLocation(640,190);
        target3.setLocation(674,287);
        target2.setLocation(666,190);
        Target.setLocation(612,114);
        Target target4 = new Target();
        addObject(target4,637,388);
        target4.setLocation(610,444);
        target3.setLocation(653,314);
        Target.setLocation(570,35);
        target2.setLocation(658,174);
        Cannon cannon = new Cannon();
        addObject(cannon,160,272);
        Target.setLocation(574,65);
        Target.setLocation(595,105);
        removeObject(Target);
        removeObject(target2);
        removeObject(target3);
        removeObject(target4);
        Target target = new Target();
        addObject(target,523,64);
        Target Target2 = new Target();
        addObject(target2,635,202);
        target.setLocation(599,35);
        target.setLocation(572,37);
        target2.setLocation(650,163);
        Target Target3 = new Target();
        addObject(target3,635,310);
        Target Target4 = new Target();
        addObject(target4,536,475);
    }
}
