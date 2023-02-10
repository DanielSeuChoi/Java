public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setNums(10.5);
        calc.setNums2(5.2);
        calc.setOperator('+');
        calc.performOperation();
        calc.getResults();
    }
}
