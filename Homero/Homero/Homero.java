import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*; //Libreria nueva
/**
 * Write a description of class Homero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homero extends Actor
{
    /**
     * Act - do whatever the Homero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean disparo = false;
    boolean poder = false;
    public void act()
    {
        if (Greenfoot.isKeyDown("Shift")){
            if (Greenfoot.isKeyDown("A")){
                move(-20);
            }
            if (Greenfoot.isKeyDown("D")){
                move(20);
            }
            if (Greenfoot.isKeyDown("W")){
                setLocation(getX(), getY()-20);
            }
            if (Greenfoot.isKeyDown("S")){
                setLocation(getX(), getY()+20);
            }
        }
        else{
            if (Greenfoot.isKeyDown("A")){
                move(-10);
            }
            if (Greenfoot.isKeyDown("D")){
                move(10);
            }
            if (Greenfoot.isKeyDown("W")){
                setLocation(getX(), getY()-10);
            }
            if (Greenfoot.isKeyDown("S")){
                setLocation(getX(), getY()+10);
            }
        }
        disparar();
    }
    public void disparar(){
        if(disparo && Greenfoot.isKeyDown("k")){
            Disparo1 ce = new Disparo1();
            getWorld().addObject(ce, getX(), getY());
            disparo = false;
        }
        if(poder && Greenfoot.isKeyDown("l")){
            Nivel1 n1 = (Nivel1)getWorld();
            if(n1.ataque2.Valor() >= 1){
                Disparo2 pa = new Disparo2();
                getWorld().addObject(pa, getX(), getY());
                poder = false;
                n1.ataque2.restar();
            }
        }
        if(!disparo && !Greenfoot.isKeyDown("k")){
            disparo = true;
        }
        if(!poder && !Greenfoot.isKeyDown("l")){
            poder = true;
        }
    }
}
