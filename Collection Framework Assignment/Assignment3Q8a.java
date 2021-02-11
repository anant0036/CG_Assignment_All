import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment3Q8a
{
    public static void failFast(Map<String, String> cityCode)
    {

        Iterator<Map.Entry<String, String>> iterator = cityCode.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "====> "+entry.getValue());
            cityCode.put("E","UK");
        }

    }
    public static void main(String[] args)
    {
        Map<String, String> cityCode = new HashMap<>();
        cityCode.put("A","GA");
        cityCode.put("B","DA");
        cityCode.put("C","LA");
        cityCode.put("D","NY");
    
        Assignment3Q8a.failFast(cityCode);

    }
}