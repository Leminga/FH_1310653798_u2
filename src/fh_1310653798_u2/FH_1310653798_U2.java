
package fh_1310653798_u2;

public class FH_1310653798_U2
{
    public static void main(String[] args)
    {
       Mensch ich = new Mensch("Markus",28,"m");
       System.out.println(ich.printAll());
       
       Humanoide hum = new Humanoide("Markus", "Steinbacher",28);
       hum.Status();
       Humanoide stud = new Student("Berhard", "Mandl", 23, 345648789,"WEB13");
       hum = stud;
       hum.Status();
    }   
}
