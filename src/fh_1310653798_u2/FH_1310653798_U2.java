
package fh_1310653798_u2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FH_1310653798_U2
{
    public static void main(String[] args)
    {
       Mensch ich = new Mensch("Markus",28,"m");
       System.out.println(ich.printAll());
       
       Humanoide hum = new Humanoide("Markus", "Steinbacher",28);
       hum.Status();
       Humanoide stud = new Student("Markus", "Steinbacher", 28, 1310653798,"WEB13");
       hum = stud;
       hum.Status();
       
       List<Auto> list = new ArrayList<>();
       Auto audi1 = new Auto((short)1,Auto.Color.BLACK);
       Auto audi2 = new Auto((short)2,Auto.Color.BLUE);
       Auto audi3 = new Auto((short)3,Auto.Color.BLUE);
       Auto audi4 = new Auto((short)4,Auto.Color.RED);
      
       list.add(audi1);
       list.add(audi2);
       list.add(audi4);
       list.add(audi3);
       
      Collections.sort(list);
       
        for (Auto a : list)
        {
            System.out.println(a.getPs()+""+a.getFarbe());
        }
    }   
}
