public class Operators {

    public static void main(String[] args) {

        // sum
        int sumResult = sum(1, 2);
        System.out.println(sumResult);

        // sub
        int subResult = sub(1, 2);
        System.out.println(subResult);

        // mul
        int mulResult = mul(1, 2);
        System.out.println(mulResult);

        // div
        float divResult = div(1, 2);
        System.out.println(divResult);

        // pow
        double powResult = pow(4, 2);
        System.out.println(powResult);

    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static float div(int a, int b) {
        return (float) a / b;
    }

    private static double pow(int a, int b) {
        return Math.pow(a, b);
    }
}
