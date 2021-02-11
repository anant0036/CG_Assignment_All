import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6

{
    public static void main(String[] args)
    {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("html");
        list.add("css");
        list.add("mongoDb");

        convertToUpperCase(list);

    }

    public static List<String> convertToUpperCase(List<String> list)
    {
        class Op implements UnaryOperator<String>
        {
            public String apply(String str)
            {
                return str.toUpperCase();
            }
        }
        list.replaceAll(new Op());

        System.out.println(list);

        return list;
        
    }  
}

