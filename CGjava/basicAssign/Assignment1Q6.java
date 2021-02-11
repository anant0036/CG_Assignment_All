import java.util.Scanner;
class Login
{
    
    public String loginUser(String user, String pass)
    {
        String name = "Ajay";
        String password = "password";

        String finalAnswer = "";

        
        
        int trycount = 0;
        
        while(trycount != 3)
        {

            Scanner usernameBy = new Scanner(System.in);
            System.out.println("Enter userId");
            String usernameByUser = usernameBy.nextLine();

            Scanner passBy = new Scanner(System.in);
            System.out.println("Enter password");
            String passByuser = passBy.nextLine();

            boolean yaya = usernameByUser.equals(user);
            boolean nana = passByuser.equals(pass);


            if(yaya == true && nana == true)
            {
                System.out.println("Welcome "+ user);
                String con = "Welcome ";
                finalAnswer = con+user;
                trycount++;
                break;
            }
            else if(yaya != true && nana != true)
            {
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
                trycount++;
                continue;
            }
            
            
        }
        if(trycount>2)
        {
            System.out.println("You have entered wrong credentials 3 times");
            System.out.println("Contact Admin");
        }
        
        
        return finalAnswer;
        

    }

}
public class Assignment1Q6 {
    public static void main(String[] args) 
    {
        String userId = "Ajay",password = "password";
        Login auth = new Login();
        auth.loginUser(userId,password);
    }
}