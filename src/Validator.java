import java.util.regex.Pattern;

@FunctionalInterface
public interface Validator<String> {
    public boolean validator(String value);
}
