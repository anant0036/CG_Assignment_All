import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class doit implements Consumer<Integer>
{

        @Override
        public void accept(Integer i) {
            System.out.println(i);
        }
        
}

class Multi extends Thread
{  
    public void run()
    {  
        System.out.println("thread is running...");  
    }

    

}

public class Assignment4Q8
{

    

    // List<Integer> values = Arrays.asList(4,5,6,7,8);
    // Consumer<Integer> c = i -> System.out.println(i);
    // values.forEach(c);
    
    public static void main(String args[])
    {  
        Multi t1=new Multi();  
        t1.start(); 
        
        List<Integer> values = Arrays.asList(2,3,4,5);
        Consumer<Integer> c = new doit();
        values.forEach(c);
    } 

}
