import com.zixi.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

//        Person person = context.getBean("person", Person.class);
//        System.out.println(person);
//
//
//        Person person1 = context.getBean("person1", Person.class);
//        System.out.println(person1);

        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);

        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);

    }
}
