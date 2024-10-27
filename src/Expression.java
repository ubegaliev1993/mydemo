class Expression {
    private final int operand1;
    private final int operand2;
    private final char operator;

    Expression(String input) throws Exception {
        input = input.trim();

        if (input.matches(".*\\d+\\s+\\d.*")) {
            throw new Exception("throws Exception");
        }

        String[] parts = input.split(" ");

        if (parts.length == 1) {
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        }
        if (parts.length != 3) {
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        try {
            operand1 = Integer.parseInt(parts[0]);
            operator = parts[1].charAt(0);
            operand2 = Integer.parseInt(parts[2]);

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                throw new Exception("Неверный оператор");
            }

            if (operand1 < 1 || operand1 > 10 || operand2 < 1 || operand2 > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Некорректный формат чисел");
        }
    }

    int getOperand1() {
        return operand1;
    }

    int getOperand2() {
        return operand2;
    }

    char getOperator() {
        return operator;
    }
}
