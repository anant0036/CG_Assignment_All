abstract class Persistence
{
    abstract public String persist();
}
class FilePersistence extends Persistence
{
    String answer = " ";
    @Override
    public String persist()
    {
        answer = "Saved in File";
        return answer;
    }
}
class DatabasePersistence extends Persistence
{
    String answer = " ";
    @Override
    public String persist()
    {
        answer = "Saved in Database";
        return answer;
    }
}

public class Assignment2Q6
{
    public static void main(String[] args)
    {
        Persistence file = new FilePersistence();
        Persistence datab = new DatabasePersistence();

        System.out.println(file.persist());
        System.out.println(datab.persist());
    }
}