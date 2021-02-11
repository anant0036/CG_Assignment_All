class Rectangle5 extends Shape5 
{
    String answer = " ";
    @Override
    public String draw()
    {
           answer = "DRAWING RECTANGLE";
           return answer;
    }
}

class Line5 extends Shape5
{
    String answer = " ";
    @Override
    public String draw()
    {
        answer = "DRAWING LINE";
        return answer;
    }
}

class Cube5 extends Shape5
{
    String answer = " ";
    @Override
    public String draw()
    {
        answer = "DRAWING CUBE";
        return answer;
    }
}
abstract class Shape5
{
    abstract public String draw();
}

public class Assignment2Q5
{
    public static void main(String[] args)
    {
        Shape5 out1 = new Rectangle5();
        Shape5 out2 = new Line5();
        Shape5 out3 = new Cube5 ();

        System.out.println(out1.draw());
        System.out.println(out2.draw());
        System.out.println(out3.draw());
    }
}

