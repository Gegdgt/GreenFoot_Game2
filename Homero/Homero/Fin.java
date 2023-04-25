import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fin extends Actor
{
    /**
     * Act - do whatever the Fin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    String mensaje;
    public Fin(){
         imagen = new GreenfootImage(400, 300);
         imagen.setColor(new Color(250, 100, 0, 255));
         imagen.setFont(new Font("Arial", true, false, 30));
         imagen.drawString("Juego en Pausa", 0,30);
         setImage(imagen);
         Greenfoot.stop();
    }
    public void act()
    {
        // Add your action code here.
    }
}
