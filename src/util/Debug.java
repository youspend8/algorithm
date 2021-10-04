package util;

public final class Debug {
    public static void print(boolean[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void print(String[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", \t");
            }
        }
        System.out.println(" }");
    }

    public static void print(char[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", \t");
            }
        }
        System.out.println(" }");
    }

    public static void print(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void print(int[][] array) {
        System.out.println("{");
        for (int i = 0; i < array.length; i++) {
            print(array[i]);
        }
        System.out.println("}");
    }

    public static void print(boolean[][] array) {
        System.out.println("{");
        for (int i = 0; i < array.length; i++) {
            print(array[i]);
        }
        System.out.println("}");
    }

    public static void print(char[][] array) {
        System.out.println("{");
        for (int i = 0; i < array.length; i++) {
            print(array[i]);
        }
        System.out.println("}");
    }
}
