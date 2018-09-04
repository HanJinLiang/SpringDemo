import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("Spring");
//        helloWorld.sayHello();

        //1.创建一个Spring 的IOC容器对象
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
       //从IOC容器中回去Bean实例
       HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
       //调用方法
        helloWorld.sayHello();
    }
}
