package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Первый арнумент: ");
        Float arg1 = in.nextFloat();
        System.out.print("Второй арнумент: ");
        Float arg2 = in.nextFloat();
        System.out.print("Оператор(+,-,*,/): ");
        String operator = in.next();

        float otvet = 0;
        switch (operator){
            case "+":
                otvet = arg1 + arg2;
                break;
            case "-":
                otvet = arg1 - arg2;
                break;
            case "*":
                otvet = arg1 * arg2;
                break;
            case "/":
                otvet = arg1 / arg2;
                break;
        }
        System.out.printf("Ответ: %.2f", otvet);

    }
}
