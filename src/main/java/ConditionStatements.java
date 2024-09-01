public class ConditionStatements {
    public static void main(String[] args) {

        String car = "Polo";
        String brand = "Volkswagen";
        boolean goodCar = isItAGoodCar(car, brand);

        if (goodCar) {
            System.out.println(car + " is a good car");
        }
        else {
            System.out.println(car + " is not a good car");
        }
    }

    private static boolean isItAGoodCar(String carName, String brand) {

        if (brand.equals("Volkswagen")){
            return true;
        } else if (brand.equals("Honda") || brand.equals("Audi")) {
            return true;
        } else {
            return false;
        }
    }
}
