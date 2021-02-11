public class Assignment4Q1 
{
    public double addition(int num1,int num2)
    {
        return num1+num2;
    }
    public double subtraction(int num1,int num2)
    {
        return num1-num2;
    }
    public double multiplication(int num1,int num2)
    {
        return num1*num2;
    }
    public double division(int num1,int num2)
    {
        double m1 = num1;
        double m2 = num2;

        double ans = m1/m2;
        return ans;
    }
    public static void main(String[] args)
    {
        Assignment4Q1 yes = new Assignment4Q1 ();
        System.out.println(yes.addition(13, 5));
        System.out.println(yes.subtraction(13, 5));
        System.out.println(yes.multiplication(13, 5));
        System.out.println(yes.division(13, 5));
    }
}


