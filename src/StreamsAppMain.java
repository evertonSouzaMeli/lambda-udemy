import java.util.Arrays;
import java.util.List;

public class StreamsAppMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ana", "Emilly", "Rafael", "Henrique", "Carolina", "João", "Everton", "Renata");
        var value = "R";

        // ([Intermediaria] - Filter) Realiza filtro nos elementos de uma coleção
        list.stream().filter(str -> str.startsWith(value)).forEach(str -> System.out.println("[Filter] " + str));

        // ([Intermediaria] - Sorted) Ordena elementos de uma coleção
        list.stream().sorted().forEach(str -> System.out.println("[Sorted] " + str));

        // ([Intermediaria] - Map) Converte cada elemento recebido em outro objeto conforme a função
        list.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println("[Map] " + str));

        // ([Final] - Match) Determina se cada condição foi atendida
        //Vefica se ALGUM nome começa com o valor
        System.out.println("[Match] " + list.stream().anyMatch(str -> str.startsWith(value)));

        //Vefica se TODOS os nomes começam com o valor
        System.out.println("[Match] " + list.stream().allMatch(str -> str.startsWith(value)));

        //Vefica se NENHUM nome começa com o valor
        System.out.println("[Match] " + list.stream().noneMatch(str -> str.startsWith(value)));

        // ([Final] - Count) Retorna numero de elementos que existe na stream
        System.out.println("[Count] " + list.stream().count());

        //Podemos filtrar os elementos e conta-los
        System.out.println("[Count] " + list.stream().filter(str -> str.startsWith(value)).count());

        //([Final] - Reduce) Realiza a redução nos elementos existentes na Stream conforme a função passada,
        // transforma numa coisa só
        list.stream().reduce(((str1, str2) -> str1.toLowerCase() + " - " + str2.toUpperCase()))
                .ifPresent(str -> System.out.println("[Reduced] " + str));
    }
}
