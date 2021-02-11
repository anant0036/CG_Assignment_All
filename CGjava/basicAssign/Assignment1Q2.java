class ArmstrongNumBetweenRange
{
    
	public int armsOrNot(int num)
    {
        int modrem,ans = 0;
        while(num!= 0)
        {
            modrem = num%10;
            ans = ans+(modrem*modrem*modrem);
            num/=10;
        }
        return ans;
    }

    public int[] armstrongNumbersInRange(int min , int max)
    {
        int i = min;
        int number;
        int[] arr = new int[]{};
        while(i<max)
        {
            number = armsOrNot(i);
            if(number == i)
            {
                
                for(int j=0;j<arr.length;j++)
                {
                    arr[j] = i;
                    System.out.println(arr[j]);
                }
            }
        i++;  
        }
        return arr;
        
        
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;
       ArmstrongNumBetweenRange que = new ArmstrongNumBetweenRange();
       que.armstrongNumbersInRange(min,max);
    }
}