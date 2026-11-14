//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.function.BiFunction;

public class Main {

    public static void level_3(int leveler) {
        leveler = 0;

        // In Java, lambdas must be assigned to a functional interface type
        BiFunction<Integer, Integer, Integer> add_clearer = (x, y) -> 5;

        // Invoke the lambda using .apply() and print with newline
        System.out.println(add_clearer.apply(leveler, leveler));
    }

    public static void main(String[] args) {
        level_3(102);
    }
}