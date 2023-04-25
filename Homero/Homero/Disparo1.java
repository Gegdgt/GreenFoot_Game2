import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo1 extends Actor
{
    /**
     * Act - do whatever the Disparo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(20);
        if(getX() >= getWorld().getWidth() - 10 || (getX() <= 10)){
            getWorld().removeObject(this);
            if (getWorld() == null) return; 
        }
        else{
            if(getY() >= getWorld().getHeight() - 10||(getY() <= 10)){
                getWorld().removeObject(this);
                if (getWorld() == null) return;
            }
        }
        Actor Bart = getOneObjectAtOffset(0,0,Bart.class);
        if (Bart != null){
            Nivel1 n1 = (Nivel1)getWorld();
                n1.puntos.sumar();
                n1.Vb.restar();
                for(int i = 0;i < 1; i++)
                {
                    int mag = Greenfoot.getRandomNumber(10);
                    if(mag == 7){
                        n1.maggie(1);
                    }
                }
                if(n1.Vb.Valor() == 0){
                    getWorld().removeObject(Bart);
                    if (getWorld() == null) return;
                    n1.vidas.sumar();
                    for(int j=0;j<=10;j++){
                        n1.puntos.sumar();
                    }
                    Greenfoot.setWorld(new Nivel2());
                }
        }
    }
}
