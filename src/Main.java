//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int sum1 = calculator.add(3,4);
        int sum2 = calculator.add(3,5,7);
        double sum3 = calculator.add(3.4,7.2);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);


    }
}