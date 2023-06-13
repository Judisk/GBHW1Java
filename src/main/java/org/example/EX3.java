package org.example;
//Реализовать простой калькулятор (+-/*)
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter number one");
        double num1 = user_input.nextDouble();

        System.out.println("Enter sign");
        String sign = user_input.next();

        System.out.println("Enter number two");
        double num2 = user_input.nextDouble();

        double answer = Signs.CheckSigh(num1,sign,num2);

        if (answer%1==0){
            int answerInt = (int)answer;
            System.out.println(answerInt);
        }
        else
            System.out.println(answer);
    }

    public static class Signs{

        public static double plus(double number1 , double number2){
            return number1+number2;
        }
        public static double difference(double number1 , double number2){
            return number1-number2;
        }
        public static double multiplication(double number1 , double number2){
            return number1*number2;
        }
        public static double division (double number1 , double number2 ){
            return number1/number2;
        }

        public static double CheckSigh(double number1,String sign, double number2){

            if ( sign.equals("+")){
                return  Signs.plus(number1,number2);
            }
            else if (sign.equals("-")){
                return Signs.difference(number1,number2);
            }
            else if (sign.equals("*")){
                return Signs.multiplication(number1,number2);
            }
            else if (sign.equals("/")){
                return Signs.division(number1,number2);
            }
            else {
                System.out.println("Error. This is not a sign");
                return 0;}
        }

    }
}
