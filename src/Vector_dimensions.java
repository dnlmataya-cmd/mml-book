public class Vector_dimensions {
    public static void main(String[] args) {
        int[][] matrice_one = {
                {1, 2, 3},
                {3, 2, 1}
        };

        int[][] matrice_two = {
                {3, 5, 7},
                {4, 5, 3}
        };

        int m = matrice_one[0][0];
        int n = matrice_one[0][1];
        int o = matrice_one[0][2];

        int q = matrice_one[1][0];
        int r = matrice_one[1][1];
        int s = matrice_one[1][2];

        int[] t = {m, n, o};
        int[] u = {q, r, s};

        // Equivalent to Python's print(t, u) and print(t)
        printArray(t);
        System.out.print(" ");
        printArray(u);
        System.out.println();
        printArray(t);
    }

    // Helper method to print arrays cleanly without any imports
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}