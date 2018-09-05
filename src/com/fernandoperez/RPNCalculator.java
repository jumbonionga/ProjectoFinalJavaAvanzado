package com.fernandoperez;

public class RPNCalculator {
    private Stack stack;

    public RPNCalculator() {
        this.stack = new Stack();
    }

    public double operate(String entry) {
        String[] tokens = entry.split(" ");

        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")) {
                double operand1 = stack.pop();
                double operand2 = stack.pop();

                double result = 0;

                if(tokens[i].equals("+")) {
                    result = operand1 + operand2;
                } else if(tokens[i].equals("-")) {
                    result = operand1 - operand2;
                } else if(tokens[i].equals("*")) {
                    result = operand1 * operand2;
                } else if(tokens[i].equals("/")) {
                    result = operand1 / operand2;
                }

                stack.push(result);
            } else {
                stack.push(Double.parseDouble(tokens[i]));
            }
        }

        return stack.pop();
    }
}
