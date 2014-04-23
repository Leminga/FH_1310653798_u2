
package fh_1310653798_u2;

public class Humanoide
{
    String vorname;
    String nachname;
    int alter;

    public Humanoide(String _vorname, String _nachname , int _alter)
        {
            vorname = _vorname;
            nachname = _nachname;
            alter = _alter;
        }
        public void Status()
        {
            System.out.println("Ich bin ein Mensch mit dem Namen: "+vorname+" "+nachname+" und ich bin "+alter+"alt");
        }
}
