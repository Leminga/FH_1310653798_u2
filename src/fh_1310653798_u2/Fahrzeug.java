
package fh_1310653798_u2;

public class Fahrzeug
{
    private short reifen;
    private String farbe;
    private short ps;
    private int tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    private static int anzahl;

    public Fahrzeug(short _ps)
    {
        ps = _ps;
    }
    public short getPs()
    {
        return ps;
    }

    public void setPs(short ps)
    {
        this.ps = ps;
    }
    
    public void starten()
    {
        if (gestartet == false)
        {
            gestartet = true;
        }
    }
    public void stoppen()
    {
        if (gestartet== true)
        {
            gestartet = false;
        }
    }
    public void beschleunigen(short value)
    {
        if (gestartet == true && geschwindigkeit < 250)
        {
         geschwindigkeit += value;   
        }
    }
    public void bremsen(short value)
    {
        if (gestartet == true && geschwindigkeit > 0)
        {
            geschwindigkeit -= value;
        }
    }
}
