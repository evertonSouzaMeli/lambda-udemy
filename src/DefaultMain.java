public class DefaultMain {
    public static void main(String[] args){
        Formula formula = a ->  a;
        System.out.println(formula.sqrt(formula.value(12.0)));
    }
}
