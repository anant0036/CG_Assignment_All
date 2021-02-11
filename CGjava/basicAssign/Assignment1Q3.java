class SiCi 
{
    public double simpleInterest(double principalAmount,int time,double interestRate)
    {
        double si = (principalAmount*time*interestRate)/100;
        System.out.println(si);
        return si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
        double ci = principalAmount * (Math.pow((1 + interestRate/100),time));
        System.out.println(ci);
        return ci;
    }

}

public class Assignment1Q3 
{
    public static void main (String args[]) 
    {
        SiCi yaya = new SiCi();
        yaya.simpleInterest(100.0,10,10.0);
        yaya.compoundInterest(100.0,11,10.0);
    }
}

