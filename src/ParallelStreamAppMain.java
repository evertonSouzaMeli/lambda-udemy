import java.util.ArrayList;
import java.util.List;


public class ParallelStreamAppMain {
    public static void main(String[] args) {
        int max = 1000000;
        List<String> values = new ArrayList();

        colecaoStream();
        colecaoParallelStream();
    }

    public static void colecaoStream(){
        List<String> values = new ArrayList<>();
        int max = 1000000;

        for (int i = 0; i < max; i++) {
            values.add("=>" + i);
        }

        long t0 = System.currentTimeMillis();
        values.stream().sorted().forEach(System.out::println);
        long t1 = System.currentTimeMillis();
        System.out.println("[Stream] " + (t1 - t0));
    }

    public static void colecaoParallelStream(){
        List<String> values = new ArrayList<>();
        int max = 1000000;

        for (int i = 0; i < max; i++) {
            values.add("=>" + i);
        }

        long t0 = System.currentTimeMillis();
        values.parallelStream().sorted().forEach(System.out::println);
        long t1 = System.currentTimeMillis();
        System.out.println("[ParalellStream] " + (t1 - t0));
    }
}
