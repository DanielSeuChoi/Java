public class Calculator {
    private double nums;
    private double nums2;
    private double results;
    private char operator;

    public Calculator() {

    }

    public void setNums(double number) {
        nums = number;
    }

    public void setNums2(double number) {
        nums2 = number;
    }

    public void setOperator(char op) {
        operator = op;
    }

    public void performOperation() {
        if (operator == '+') {
            results = (nums) + (nums2);
        }
        if (operator == '-') {
            results = (nums) - (nums2);
        }
    }

    public void getResults() {
        System.out.println(results);
    }

}