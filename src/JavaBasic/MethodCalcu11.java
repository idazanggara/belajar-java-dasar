package JavaBasic;

public class MethodCalcu11 {
    public static void main(String[] args) {
        int[] data = {10, 5, 2};

        // Panggil fungsi calculator dengan operator +
        int sumResult = calculator("+", data);
        System.out.println("Hasil penjumlahan: " + sumResult);

        // Panggil fungsi calculator dengan operator -
        int subtractResult = calculator("-", data);
        System.out.println("Hasil pengurangan: " + subtractResult);

        // Panggil fungsi calculator dengan operator *
        int timesResult = calculator("*", data);
        System.out.println("Hasil perkalian: " + timesResult);

        // Panggil fungsi calculator dengan operator /
        int divideResult = calculator("/", data);
        System.out.println("Hasil pembagian: " + divideResult);
    }

    public static int calculator(String operator, int[] data) {
        if (operator.equals("+")) {
            return sum(data);
        } else if (operator.equals("-")) {
            return subtract(data);
        } else if (operator.equals("*")) {
            return times(data);
        } else if (operator.equals("/")) {
            return divide(data);
        } else {
            System.out.println("Operator tidak valid");
            return 0;
        }
    }

    public static int sum(int[] data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total;
    }

    public static int subtract(int[] data) {
        int result = data[0];
        for (int i = 1; i < data.length; i++) {
            result -= data[i];
        }
        return result;
    }

    public static int times(int[] data) {
        int result = 1;
        for (int num : data) {
            result *= num;
        }
        return result;
    }

    public static int divide(int[] data) {
        int result = data[0];
        for (int i = 1; i < data.length; i++) {
            result /= data[i];
        }
        return result;
    }
}
