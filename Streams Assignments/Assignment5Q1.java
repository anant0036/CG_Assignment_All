import java.util.ArrayList;
import java.util.List;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name,int calories,int price,String color) 
    {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

public class Assignment5Q1 {

    public static List<String> reverseSort(ArrayList<Fruit> Fruits)
    {
        Fruits.stream().sorted((o1, o2) -> (int) (o2.getCalories() - o1.getCalories()))
                .forEach(System.out::println);
        return null;
    }
    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) 
    {
     
        Fruits.stream().sorted((o1, o2) -> (int) (o1.getCalories() - o2.getCalories()))
                .forEach(System.out::println);
        return Fruits;
        
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> Fruits)
    {
        Fruits.stream().filter(i -> i.getColor() == "red").sorted((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))
        .forEach(System.out::println);
        return Fruits;
    }

    public static void main(String[] args) 
    {
        Fruit f1 = new Fruit("Apple", 120, 23, "Red");
        Fruit f2 = new Fruit("Kiwi", 110, 24, "Yellow");
        Fruit f3 = new Fruit("Lichi", 150, 28, "pink");

        List<Fruit> Fruits = new ArrayList<Fruit>();
        Fruits.add(f1);
        Fruits.add(f2);
        Fruits.add(f3);

        Assignment5Q1.reverseSort((ArrayList<Fruit>) Fruits);
        Assignment5Q1.reverseSort((ArrayList<Fruit>) Fruits);
        Assignment5Q1.filterRedSortPrice((ArrayList<Fruit>) Fruits);

    }

}

