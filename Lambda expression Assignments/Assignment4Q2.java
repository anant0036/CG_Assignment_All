import java.util.ArrayList;

public class Assignment4Q2 
{

    private int totalPrice;
    private String status;

    public int gettotalPrice()
    {
        return totalPrice;
    }
    public void settotalPrice(String status)
    {
        this.status = status;
    }
    Assignment4Q2(int totalPrice,String status)
    {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders)
    {
        for(Assignment4Q2 ob : orders)
        {
            if(ob.totalPrice >10000 && ob.status == "ACCEPTED" || ob.status == "COMPLETED")
            {
                System.out.println("YES:" + ob.status);
            }
        }
        return orders;
        

    }
    public static void main(String[] args)
    {
        Assignment4Q2 myobj1 = new Assignment4Q2(10001, "ACCEPTED");
        Assignment4Q2 myobj2 = new Assignment4Q2(10001, "COMPLETED");
        Assignment4Q2 myobj3 = new Assignment4Q2(10000, "NO");

        ArrayList<Assignment4Q2> orders = new ArrayList<Assignment4Q2>();
        
        orders.add(myobj1);
        orders.add(myobj2);
        orders.add(myobj3);

        Assignment4Q2.listOfOrders(orders);

        
    }
}

