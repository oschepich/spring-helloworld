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
//        System.out.println(bean.getMessage());
//        System.out.println(bean1.getMessage());
        System.out.println("Сравнение бинов класса HelloWorld (создан один бин?) - " + bean.equals(bean1));

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
//        System.out.println(beanCat.getMessage());
//        System.out.println(beanCat1.getMessage());
        System.out.println("Сравнение бинов класса Cat (создан один бин?) - " + beanCat.equals(beanCat1));

    }
}