import java.util.HashMap;
import java.util.Map;

class DateClass 
{
    private int date;
    private int month;
    private int year;

    public DateClass(int date,int month,int year)
    {
        super();
        this.date = date;
        this.month = month;
        this.year = year;

    }
    public int getDate()
    {
        return date;
    }
    public void setDate(int date)
    {
        this.date = date;
    }
    public int getMonth()
    {
        return month;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
}



public class Assignment3Q4 
{

    public String getEmployee(HashMap<DateClass, String> dob,String employeeName){
        
        for(Map.Entry<DateClass, String> entry : dob.entrySet())
        {
            System.out.println(entry.getKey() + "==="+entry.getValue());
        }
        
        return null;
    }
    public static void main(String[] args)
    {
        DateClass date1 = new DateClass(25,1,2005);
        DateClass date2 = new DateClass(15,4,2000);
        DateClass date3 = new DateClass(8,9,1999);

        String employeeName1 ="Joe";
        String employeeName2 ="Riya";
        String employeeName3 ="Roy";

        HashMap<DateClass, String> myhash = new HashMap<>();
        myhash.put(date1,employeeName1);
        myhash.put(date2,employeeName2);
        myhash.put(date3,employeeName3);


        Assignment3Q4 ans = new Assignment3Q4();
        
        ans.getEmployee(myhash, employeeName1);
        ans.getEmployee(myhash, employeeName2);
        ans.getEmployee(myhash, employeeName3);
    }
}