package USTBATCHNO3.Com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    	 Notificationservice n=context.getBean(Notificationservice.class);
    	
    	n.notifyservice();
    	
    }
}
