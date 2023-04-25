import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class VidaBart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VidaBart extends Actor
{
    /**
     * Act - do whatever the VidaBart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    int cont;
    String mensaje;
    int cx,cy;
    int h;
    int count;
    public void act()
    {
        
    } 
    public VidaBart(int a, int cx, int cy, int h){
        cont = a; 
        count = a;
        imagen = new GreenfootImage(250,150);
        imagen.setColor(new Color(200, 200, 0, 255));
        imagen.setFont(new Font("Arial", true, false, 16));
        this.cx = cx;
        this.cy = cy;
        this.h = h;
        dibuja();
    }
    public void dibuja()
    {
        imagen.clear();
        imagen.setColor(new Color(100, 255, 0, 100));
        imagen.drawRect(cx, cy, count, h);
        imagen.fillRect(cx, cy, cont, h);
        imagen.setColor(new Color(255, 255, 255, 255));
        imagen.drawString(String.valueOf(cont),25,20);
        setImage(imagen);
    }
    public void sumar(){
        cont++;
        dibuja();
    }
    public void restar(){
        cont--;
        dibuja();
    }
    public int Valor(){
        return cont;
    }
}
