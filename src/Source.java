public class Source {

    @FunctionalInterface
    interface BinaryOperation {
        int apply(int x, int y);
    }

    public static void level_3(int leveler) {
        leveler = 0;

        // Using the custom functional interface instead of java.util.function.BiFunction
        BinaryOperation add_clearer = (x, y) -> 4;

        System.out.println(add_clearer.apply(leveler, leveler));
    }

    public static void main(String[] args) {
        level_3(102);
    }
}
