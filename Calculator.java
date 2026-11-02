class Calculator {
    void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    void calculate(double a, double b) {
        System.out.println("Product: " + (a * b));
    }
    void calculate(int a, int c, int d) {
        if (a > c) {
            System.out.println("Greatest: " + a);
        } else {
            System.out.println("Greatest: " + c);
        }
    }
    void calculate(int a, double b) {
        System.out.println("Difference: " + (a - b));
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.calculate(10, 20);
        obj.calculate(20.05, 10.78);
        obj.calculate(20, 10, 0);
        obj.calculate(20, 35.25);
    }
}
