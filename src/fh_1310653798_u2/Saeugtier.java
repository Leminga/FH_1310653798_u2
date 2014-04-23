
package fh_1310653798_u2;

public abstract class Saeugtier
{
    private String name;
    private int alter;
    private String geschlecht;    
    
    public Saeugtier(String _name, int _alter, String _geschlecht)
    {
        name = _name;
        alter = _alter;
        geschlecht = _geschlecht;
    }    
    public abstract String printAll();  

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAlter()
    {
        return alter;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public String getGeschlecht()
    {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht)
    {
        this.geschlecht = geschlecht;
    }
    
}

