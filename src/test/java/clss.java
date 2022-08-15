import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class clss {
    public static void main(String[] args) {
//        for (int i = 9; i>0; i--) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j+"*"+i+"="+j*i+"\t");
//            }
//            System.out.println();
//        }
//    }

            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

            Bean obj = (Bean) context.getBean("bean");

        System.out.println(obj);
    }
}

