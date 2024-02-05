import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
public class stream3 {
    public static void main(String args[]){
        List<String> ls = Arrays.asList("pink","yellow","green","magenta","purple");
        List<String>str = ls.stream()
        .filter(str2->str2.length()>4 && str2.length()<=6)
        .collect(Collectors.toList());

        str.forEach(System.out::println);
    }
}
