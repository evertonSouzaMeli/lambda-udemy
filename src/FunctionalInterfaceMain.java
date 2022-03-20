import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {

        //Faz um teste qualquer no objeto recebido, retorna [TRUE] [FALSE]
        Predicate<String> predicate = s -> s.length() > 4;
        System.out.println("[Predicate] " + predicate.test("teste"));

        //Não recebe nenhum valor e retorna um resultado T, bom para instanciar objetos
        Supplier<Object> objectSupplier = () -> new Object();
        System.out.println("[Supplier] " + objectSupplier.get().getClass().getSimpleName());

        //Recebe um valor T e retorna R, bom para fazer processamento de informação
        Function<Object, String> objectStringFunction = object -> object.getClass().getSimpleName();
        System.out.println("[Function] " + objectStringFunction.apply(new Object()));

        //Recebe valor T e imprime
        Consumer<Object> objectConsumer = object -> System.out.println("[Consumer] " + object.getClass().getSimpleName());
        objectConsumer.accept(new Object());

        //Compara dois valores e retorna um int
        Comparator<Object> objectComparator = (object1, object2) -> object1.toString().compareTo(object2.toString());
        System.out.println("[Comparator] " + objectComparator.compare(new Object(), new Object()));
    }
}
