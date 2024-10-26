class ExpressionParser {
    public Expression parse(String input) throws Exception {
        // Разделяем строку на части с учетом пробелов
        String[] parts = input.trim().split(" ");

        // Проверка на корректное количество частей
        if (parts.length != 3) {
            throw new Exception("т.к. строка не является математической операцией или формат не соответствует требованию (два операнда и один оператор)");
        }

        try {
            // Парсим первый операнд
            int operand1 = Integer.parseInt(parts[0]);
            // Определяем оператор и проверяем его корректность
            char operator = parts[1].charAt(0);
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                throw new Exception("Некорректный оператор");
            }
            // Парсим второй операнд
            int operand2 = Integer.parseInt(parts[2]);

            // Проверка диапазона чисел
            if (operand1 < 1 || operand1 > 10 || operand2 < 1 || operand2 > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }

            return new Expression(operand1, operand2, operator);

        } catch (NumberFormatException e) {
            throw new Exception("Некорректный формат чисел");
        }
    }
}
