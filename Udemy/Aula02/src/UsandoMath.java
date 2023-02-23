public class UsandoMath {
    public static void main(String[] args) {
        double value = Math.round(10.5);
        System.out.println(value);
        double valueTwo = Math.ceil(10.1);
        System.out.println(valueTwo);
        double valueThree = Math.floor(10.9);
        System.out.println(valueThree);
        int valueFour = (int) Math.round(Math.random() * 100);
        System.out.println(valueFour);
    }
}
