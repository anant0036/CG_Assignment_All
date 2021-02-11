import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.workspace.assignment.autowire;
import org.workspace.assignment.req;

public class reqrun {

	public static void main(String[] args) 
	{

		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\Anant Bhushan\\eclipse-workspace\\SpringDemo\\reqbean.xml");
		
		req r = ctx.getBean("req", req.class);
		
		System.out.println(r.getMessageId()+"\t"+r.getMessage());
		
		((AbstractApplicationContext) ctx).close();

	}

}
