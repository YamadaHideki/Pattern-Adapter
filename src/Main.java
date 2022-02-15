public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints intsCalculator = new IntsCalculator();
        System.out.println(intsCalculator.sum(4, 24));
        System.out.println(intsCalculator.mult(3, 3));
        System.out.println(intsCalculator.pow(5, 6));
    }
}
