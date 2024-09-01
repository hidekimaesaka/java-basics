public class TernaryOperator {
    public static void main(String[] args) {

        boolean isRaining = false;

        boolean getUmbrella = isRaining ? true : false;

        if (getUmbrella) {getUmbrella();}
        leaveHome();

    }

    private static void getUmbrella() {
        System.out.println("Getting my umbrella!");
    }

    private static void leaveHome() {
        System.out.println("Leaving home!");
    }
}
