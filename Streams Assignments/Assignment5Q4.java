import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;


class Trader 
{
    private String name;
    private String city;

    public Trader(String n, String c){
		this.name = n;
		this.city = c;
	}

	public String getName(){
		return this.name;
	}

	public String getCity(){
		return this.city;
	}

	public void setCity(String newCity){
		this.city = newCity;
	}

	public String toString(){
		return "Trader:"+this.name + " in " + this.city;
	}
}

class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value)
	{
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader(){ 
		return this.trader;
	}

	public int getYear(){
		return this.year;
	}

	public int getValue(){
		return this.value;
	}
	
	public String toString(){
	    return "{" + this.trader + ", " +
	           "year: "+this.year+", " +
	           "value:" + this.value +"}";
	}

    public Object getCity() {
        return null;
    }
}






public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) 
    {
        List<Transaction> tr2011 = transactions.stream()
        .filter(transaction -> transaction.getYear() == 2011)
        .sorted(comparing(Transaction::getValue))
        .collect(toList());
        System.out.println(tr2011);

        return tr2011;
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) 
    {
        List<Transaction> no = transactions.stream().filter(Trader -> Trader.getCity().equals("delhi"))
                .collect(toList());

        return null;
    }
    public static int highestTransaction(List<Transaction> transactions)
    {
        int highestValue = 
            transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(0, Integer::max);
        System.out.println(highestValue);
        return highestValue;
        
    }

    public static int smallestTransaction(List<Transaction> transactions)
    {
        int lowValue = 
            transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(0, Integer::min);
        System.out.println(lowValue);
        return lowValue;
         
    }

    public static void main(String[] args) 
    {
        Trader joe = new Trader("joe", "pune");
        Trader mark = new Trader("mark","Delhi");
        Trader alan = new Trader("Alan","pune");
        Trader bri = new Trader("Bri","indore");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(joe, 2011, 300), 
            new Transaction(mark, 2012, 1000),
            new Transaction(alan, 2011, 400),
            new Transaction(bri, 2012, 710),	
            new Transaction(mark, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
    }
}

