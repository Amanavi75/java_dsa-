import java.util.stream.*;

public class functiondrilling {
    public static void main(String[] args) {
        Stream.iterate(1,element->element+1).filter(element->element%6==0).limit(10).forEach(System.out::println);
    }
}
