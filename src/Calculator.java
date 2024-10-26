class Calculator {
    public int calculate(Expression expression) throws Exception {
        int result;
        switch (expression.getOperator()) {
            case '+':
                result = expression.getOperand1() + expression.getOperand2();
                break;
            case '-':
                result = expression.getOperand1() - expression.getOperand2();
                break;
            case '*':
                result = expression.getOperand1() * expression.getOperand2();
                break;
            case '/':
                if (expression.getOperand2() == 0) {
                    throw new Exception("Деление на ноль невозможно");
                }
                result = expression.getOperand1() / expression.getOperand2();
                break;
            default:
                throw new Exception("Неподдерживаемая операция");
        }
        return result;
    }
}
