import java.util.*;

public class Assignment4Q5 
{
    

    public static String processWords(List<String> list)
    {
        
        String a = list.get(0);
        String b = list.get(1);
        String c = list.get(2);
        String d = list.get(3);
        String e = list.get(4);
        String f = list.get(5);

        String agot = a.substring(0, 1);
        String bgot = b.substring(0, 1);
        String cgot = c.substring(0, 1);
        String dgot = d.substring(0, 1);
        String egot = e.substring(0, 1);
        String fgot = f.substring(0, 1);


        String my = agot.concat(bgot);
        String my1 = my.concat(cgot);
        String my2 = my1.concat(dgot);
        String my3 = my2.concat(egot);
        String my4 = my3.concat(fgot);
        System.out.println(my4);
        return my4;

    }

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        Assignment4Q5.processWords(list);
    }

}  

