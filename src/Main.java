import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
  /*      //不使用框架的方法
        HelloWorld helloWorld=new HelloWorld();
        helloWorld.setName("Spring");
        helloWorld.SayHello();*/

        //首先创建一个Spring的IOC容器对象
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring-config.xml");
        //再从容器中获取bean实例
        HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
        //调用sayhello（）方法
        helloWorld.SayHello();
    }
}
