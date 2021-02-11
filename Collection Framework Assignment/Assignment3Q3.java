import java.util.ArrayList;
import java.util.List;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.ListIterator;

// public class Assignment3Q3
// {
//     public List traverseReverse(ArrayList aList) {

//         ArrayList<String> alist = new ArrayList<>();
//         alist.add("Apple");
//         alist.add("Banana");
//         alist.add("Coco");
//         alist.add("Dog");
//         alist.add("Egg");

//         ListIterator<String> display = alist.listIterator();
//         while (display.hasPrevious()) {
//             System.out.println(display.previous());
//         }
//         return aList;
        

//     }

//     public static void main(String[] args) {
        

//         Assignment3Q3 ans = new Assignment3Q3();
//         ans.traverseReverse(null);

//     }
// }


public class Assignment3Q3 
{
    public static List<Integer> traverseReverse(ArrayList<Integer> aList)
    {
        ArrayList<Integer> rev = new ArrayList<Integer>();
        for(int i = aList.size() - 1;i>=0;i--)
        {
            rev.add(aList.get(i));
        }

        for (int j = 0; j < rev.size(); j++) { 
            System.out.print(rev.get(j) + " "); 
        } 

        return rev;

    }
    public static void main(String[] args)
    {
        // Assignment3Q3 ans = new Assignment3Q3();

        ArrayList<Integer> mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);

        Assignment3Q3.traverseReverse(mylist);
    }
}
