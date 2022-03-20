import java.util.Arrays;
import java.util.List;

public class LambdaApp {
    static int numero;
    static int somatorio;
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        integers.forEach(integer -> {
            var x = integer/2;
            numero = 10;
            integer += numero;
            somatorio += integer;

            System.out.println(integer);
            System.out.println(x);
        });
        System.out.println(somatorio);
    }
}
