import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speedApple = 1;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + speedApple);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
        setSpeed();
    }
    
    public void setSpeed(){
        MyWorld myworld = (MyWorld) getWorld();
        speedApple = myworld.speed;
    }
}
