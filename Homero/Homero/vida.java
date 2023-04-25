import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vida extends Actor
{
    /**
     * Act - do whatever the vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int L = 5;
    public vida(){
        
    }
    public void Disminuir(){
        L--;
        if(L == 0){
            Greenfoot.setWorld(new BadEnding());
        }
    }
    public void act()
    {
        
    }
}
