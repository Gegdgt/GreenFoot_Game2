import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class Menu extends World
{
    Flecha signo = new Flecha();
    Flecha2 signo2 = new Flecha2();
    private int opcion = 0;
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public Menu() 
    {
        super(906, 501, 1);
        prepare();
    }
    private void prepare()//prepara el menú con los objetos necesarios
    {
        addObject(new Start(), 750, 350);
        addObject(new Exit(), 750, 450);
        addObject(signo, 630, 350);
        addObject(signo2, 870, 350);
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if((Greenfoot.isKeyDown("W")) && opcion!=0){opcion++;}
        if(Greenfoot.isKeyDown("S") && opcion!=1){opcion--;}
        if(opcion >= 2) opcion=0;
        if(opcion<0)opcion=1;
        signo.setLocation(630, 350 + (opcion*100));
        signo2.setLocation(870, 350 + (opcion*100));
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            
            switch(opcion){
            case 0:
                Greenfoot.setWorld(new Nivel1());
            case 1:
                Greenfoot.stop();
                break;
            }
        }
    }
}
