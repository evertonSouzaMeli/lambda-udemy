import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello ", "World" ," My ","Name ","Is ","Everton");
        Consumer<String> consumer = System.err::print;
        list.forEach(consumer::accept);
    }
}
