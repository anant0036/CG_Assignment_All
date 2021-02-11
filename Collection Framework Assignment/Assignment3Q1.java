import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparator<Person>
{
    private String name;
    private int height;
    private double weight;

//  //FOR NAME
    public String getName()
    {
        return name;
    }
    public void setName(String name) 
    {  
        this.name = name;  
    }

// //FOR HEIGHT
    public int getHeight()
    {  
        return height;  
    } 
    public void setHeight(int height) 
    {  
        this.height = height;
    }

// //FOR WEIGHT
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public Person(String name, int height, Double weight) 
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    

    public Person() {}

    @Override
    public int compare(Person o1, Person o2) {
        
        if(o1.name==o2.name)  
           return 0;  
         
        else  
           return -1;
    }

}

public class Assignment3Q1
{
    public static void main(String[] args) 
    {
        TreeSet<Person> per = new TreeSet<Person>(new Person());
        
        per.add(new Person("JOE",105,75.0));
        per.add(new Person("DIGI",110,75.0));
        per.add(new Person("RIVA",98,65.0));

        for(Person person : per)
        {
            System.out.println("Name: "+person.getName());
            System.out.println("Height: "+person.getHeight());
            System.out.println("Weight: "+person.getWeight());
        }
    }
}

