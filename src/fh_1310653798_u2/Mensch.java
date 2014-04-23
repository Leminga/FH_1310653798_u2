
package fh_1310653798_u2;


public class Mensch extends Saeugtier
{
    public Mensch(String _name, int _alter, String _geschlecht)
    {
        super(_name, _alter, _geschlecht);
    }
    
    @Override
    public String printAll()
    {
        return super.getName()+"#"+super.getAlter()+"#"+super.getGeschlecht();
    }
    
}
