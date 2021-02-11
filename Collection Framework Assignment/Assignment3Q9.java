import java.util.*;
class SavingAccount implements Comparator<SavingAccount> 
{

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;

    public SavingAccount(double acc_balance,int acc_ID,String accountHolderName,boolean isSalaryAccount)
    {
        super();
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public double getaccBal()
    {
        return acc_balance;
    }
    public void setaccBal(int acc_balance)
    {
        this.acc_balance = acc_balance;
    }
    public int getaccId()
    {
        return acc_ID;
    }
    public void setaccId(int acc_ID)
    {
        this.acc_ID = acc_ID;
    }
    public String getHname()
    {
        return accountHolderName;
    }
    public void setHname(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }
    public boolean getSal()
    {
        return isSalaryAccount;
    }
    public void setSak(Boolean isSalaryAccount)
    {
        this.isSalaryAccount = isSalaryAccount;
    }

    public SavingAccount() {}

    @Override
    public int compare(SavingAccount o1, SavingAccount o2) {
        if(o1.acc_ID==o2.acc_ID)  
           return 0;  
         
        else  
           return -1;
    }
}

class BankAccountList{

    


    private TreeSet<SavingAccount> savingAccounts = new TreeSet<SavingAccount>();
    


    public boolean addSavingAccount(SavingAccount savingAccount)
    {
         return savingAccounts.add(savingAccount);
         
    }

    public List<Integer> displaySavingAccountIds() 
    {
        
        Iterator<SavingAccount> itr= savingAccounts.iterator(); 
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }
		return null;

    }
}

public class Assignment3Q9 {
    public static void main(String[] args)
    {
        SavingAccount sa = new SavingAccount(100.0, 1, "Jack", true);
        SavingAccount pa = new SavingAccount(500.0, 2, "Mady", false);
        BankAccountList yes  = new BankAccountList();

        yes.addSavingAccount(sa);
        yes.addSavingAccount(pa);

        yes.displaySavingAccountIds();
    }
}

