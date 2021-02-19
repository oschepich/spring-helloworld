import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.toString());
        System.out.println(bean1.toString());
        System.out.println("Сравнение бинов класса HelloWorld (создан один бин?) - " + bean.toString().equals(bean1.toString()));

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.toString());
        System.out.println(beanCat1.toString());
        System.out.println("Сравнение бинов класса Cat (создан один бин?) - " + beanCat.toString().equals(beanCat1.toString()));

    }
}