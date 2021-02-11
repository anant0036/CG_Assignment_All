abstract class Shape
{
    abstract void draw();
}

class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("RECTANGLE");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("CIRCLE");
    }
}

public class Assignment2Q4 
{
    public static void main(String args[])
    {
        Shape er = new Circle();
        er.draw();
    }
}
