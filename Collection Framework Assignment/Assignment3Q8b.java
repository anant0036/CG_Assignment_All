import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Assignment3Q8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list)
    {
        
        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
            list.add(5);
        }
        return list;

    }
    public static void main(String args[])
    {

        List<Integer> mylist = new CopyOnWriteArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);

        Assignment3Q8b.failFast((CopyOnWriteArrayList<Integer>) mylist);

    }
}