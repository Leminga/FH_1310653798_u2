
package fh_1310653798_u2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Auto extends Fahrzeug implements Comparable<Auto>
{
    private boolean klimaanlage;
    private short airbags;
    private Color farbe;

    public Auto(short _ps, Color _farbe)
    {
        super(_ps);
        farbe = _farbe;
    }
    public Auto(short _ps)
    {
        this(_ps,Color.BLACK);
    }    
    public Color getFarbe()
    {
        return farbe;
    }
    
    public void setFarbe(Color farbe)
    {
        this.farbe = farbe;
    }
    
    public void klimaanlageAn()
    {
        if (!klimaanlage)
        {
            klimaanlage = true;
        }
        else
        {
            System.out.println("Klimaanlage läuft bereits.");
        }
    }
    public void klimaanlageAus()
    {
        if (klimaanlage)
        {
            klimaanlage = false;
        }
        else
        {
            System.out.println("Klimaanlage ist bereits aus.");
        }
    }

    @Override
    public int compareTo(Auto a)
    {
        if (this.getPs()<a.getPs())
        {
            return -1;
        }
        else if (this.getPs()>a.getPs())
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }
    public enum Color 
    {
    WHITE, BLACK, RED, YELLOW, BLUE;  
    }
}
