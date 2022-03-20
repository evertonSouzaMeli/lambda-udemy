import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorMain {
    public static void main(String[] args) {
        Validator<String> validatorCep = (value) -> value.matches("[0-9]{5}-[0-9]{3}");
        Validator<String> validatorCel = (value) -> value.matches("9[0-9]{4}-[0-9]{4}");

        System.out.println(validatorCep.validator("00000-000"));
        System.out.println(validatorCel.validator("98830-7066"));
    }
}
