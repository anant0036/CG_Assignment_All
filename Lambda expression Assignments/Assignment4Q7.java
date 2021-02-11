import java.util.HashMap;
import java.util.Map;

public class Assignment4Q7 
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);

        Assignment4Q7.convertKeyValueToString(map);
    }

    public static String convertKeyValueToString(HashMap<String, Integer> map) 
    {
        String s2 = " ";
        String yes = " ";
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            String key = entry.getKey();
            int y = entry.getValue();
            String toadd = Integer.toString(y);
            s2 = (key + toadd);
            System.out.println(s2);
        }
        yes = s2;
        return yes;
        
    }
}