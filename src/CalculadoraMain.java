import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.pow;

public class CalculadoraMain {
    public static void main(String[] args) {
        IMath somar = (a, b) -> a + b;
        IMath subtrair = (a, b) -> a - b;
        IMath multiplicar = (a, b) -> a * b;
        IMath dividir = (a, b) -> a / b;
        IMath potencia = (a, b) -> pow(a,b);
        IMath raiz = (a, b) -> new BigDecimal(pow(a, 1/b)).setScale(2, RoundingMode.HALF_EVEN).doubleValue();

        System.out.println("Somar: " + calcula(5, 5, somar));
        System.out.println("Subtrair: " + calcula(5, 5, subtrair));
        System.out.println("Multiplicar: " + calcula(5, 5, multiplicar));
        System.out.println("Dividir: " + calcula(5, 5, dividir));
        System.out.println("Potencia: " + calcula(5, 2, potencia));
        System.out.println("Raiz: " + calcula(6, 2, raiz));
    }

    static double calcula(int a, int b, IMath operation) {
        return operation.operacao(a, b);
    }
}
