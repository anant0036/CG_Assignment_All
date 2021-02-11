import java.util.ArrayList;

public class Assignment4Q4 
{
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList) {
        employeeList.removeIf(name -> name.length() % 2 != 0);
        System.out.println(employeeList);
        return employeeList;
    }

    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("apple");
        mylist.add("coco");
        mylist.add("banana");
        mylist.add("kiwi");
        mylist.add("YES");

        System.out.println(mylist);
        System.out.println("-----------------------");
        Assignment4Q4.removeOddLength(mylist);
    }
}