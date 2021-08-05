package study;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String value = new Scanner(System.in).nextLine();
        double result = new Calculator().calculate(value);
        System.out.println(value + " = " + result);
    }

    public double calculate(String value) {
        String[] values = value.split(" ");

        // 입력의 홀수는 숫자, 짝수는 연산자가 됨.
        // 연산자를 기준으로 result와 뒤의 인덱스의 값을 계산함.
        // 계산 결과는 result에 저장.
        // 모든 연산자를 거친 후 result값이 계산 결과.

        double result = Integer.parseInt(values[0]);
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 1) {
                if (values[i].equals("+")) {
                    result = add(result, Integer.parseInt(values[i + 1]));
                }else if (values[i].equals("-")) {
                    result = subtract(result, Integer.parseInt(values[i + 1]));
                }else if (values[i].equals("*")) {
                    result = multiply(result, Integer.parseInt(values[i + 1]));
                }else if (values[i].equals("/")) {
                    result = divide(result, Integer.parseInt(values[i + 1]));
                }
            }
        }
        return result;
    }

    private double add(double x, double y) {
        return x + y;
    }

    private double subtract(double x, double y) {
        return x - y;
    }

    private double multiply(double x, double y) {
        return x * y;
    }

    private double divide(double x, double y) {
        return x / y;
    }
}
