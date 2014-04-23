
package fh_1310653798_u2;

import javax.jws.Oneway;

public class Student extends Humanoide
{
    private int matrikelnummer;
    private String studiengang;
    
    public Student(String _vorname, String _nachname, int _alter,int _matrikelnummer, String _studiengang)
    {
        super(_vorname, _nachname, _alter);
        studiengang = _studiengang;
        matrikelnummer = _matrikelnummer;
    }
    @Override
    public void Status()
    {
        System.out.println("Ich bin ein Student mit dem Namen "+ vorname+" "+nachname+" mit der Matrikelnummer: "+matrikelnummer+ " und ich Studiere "+studiengang);
    }

    public int getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang()
    {
        return studiengang;
    }

    public void setStudiengang(String studiengang)
    {
        this.studiengang = studiengang;
    }    
}
