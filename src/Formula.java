@FunctionalInterface
public interface Formula{
    double value(double a);

    default double sqrt(double a){
      return Math.sqrt(value(a));
    }
}
