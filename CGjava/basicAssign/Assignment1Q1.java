class ArmstrongOrNot
{
    public boolean armstrongCheck(int num)
    {
        int check = 0;
        int temp = num;
        while(num>0)
        {
            int threeTime = num % 10;
            num = num/10;
            check = check+(threeTime*threeTime*threeTime);
        }
        if(temp == check)
        {
            System.out.println("IT IS A -->  Armstrong");
            return true;
            
        }
        else
        {
            System.out.println("IT IS NOT -->  Armstrong");
            return false;
        }
    }
}

public class Assignment1Q1 
{
    public static void main(String[] args)
    {
        ArmstrongOrNot ask = new ArmstrongOrNot();
        ask.armstrongCheck(153);
        ask.armstrongCheck(123);
    }
} 
