import java.util.function.Consumer;
import java.util.function.Supplier;

public class Assignment4Q3
{
    static void modifyValue()
    {
        Product p = new Product();
        Consumer<Product> setName=t->t.setName("Bhushan");
        setName.accept(p); 
        System.out.println(p.getName());
    }
    static class Product
    { 
        private String name;

        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
    }
    static void display()
    {
        Supplier<Double> getRand=()->Math.random();
        System.out.println(getRand.get());
    }
    public static void main(String[] args) 
    {
        Assignment4Q3.display();
        Assignment4Q3.modifyValue();
    }

}