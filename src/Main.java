import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Результат: throws Exception // " + e.getMessage());
        }

        scanner.close();
    }

    public static String calc(String input) throws Exception {
        ExpressionParser parser = new ExpressionParser();
        Expression expression = parser.parse(input);

        Calculator calculator = new Calculator();
        int result = calculator.calculate(expression);

        return String.valueOf(result);
    }
}
