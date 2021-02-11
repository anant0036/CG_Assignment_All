class ResultDeclaration
{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
    {
        String pass = "";;
        if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
        {
            pass = "failed";
        }
        else if
        (
            subject1Marks>60 && subject2Marks>60 && subject3Marks<60 
          ||subject2Marks>60 && subject3Marks>60 && subject1Marks<60
          ||subject3Marks>60 && subject1Marks>60 && subject2Marks<60 
        )
        {
            pass = "promoted";
        }
        else if(subject1Marks<60 || subject2Marks>60 || subject3Marks>60)
        {
            pass = "failed";
        }

        return pass;
    }
}
public class Assignment1Q4 
{
    public static void main(String[] args)
    {

    }
}

