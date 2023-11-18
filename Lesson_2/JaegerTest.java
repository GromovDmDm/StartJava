import java.time.LocalDateTime;
import java.time.Month;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerMarkFive = new Jaeger();
        jaegerMarkFive.setLaunched(LocalDateTime.of(2019, Month.NOVEMBER, 2, 0, 0, 0));
        jaegerMarkFive.setMark("Mark-5");
        jaegerMarkFive.setStatus("Destroyed");
        jaegerMarkFive.setHeight(76.2);
        jaegerMarkFive.setWeight(1.85);
        System.out.println(jaegerMarkFive);
        System.out.println();

        Jaeger jaegerMarkThree = new Jaeger(LocalDateTime.of(2017, Month.JULY, 10, 0, 0, 0),
                "Mark-3", "Destroyed", 79.25, 1.97);
        jaegerMarkThree.setWeight(1.98);
        System.out.println(jaegerMarkThree);
    }
}