//Реализовать простой калькулятор
import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running) {
            System.out.println("выберете необходимую операция: 1 - суммирование, 2 - вычитание, 3 - умножение, 4 - деление, 5 - выйти из калькулятора");
            int operation = sc.nextInt();
            if(operation == 5){
                running = false;
                break;
            }
            System.out.println("Введите первое число");
            double firstNumber = sc.nextDouble();
            System.out.println("Введите второе число");
            double secondNumber = sc.nextDouble();

            controller(operation, firstNumber, secondNumber);
        }
    }

    private static double sum(double i, double j){
        return i + j;
    }

    private static double diff(double i, double j){
        return i - j;
    }

    private static double multiply(double i, double j){
        return i * j;
    }

    private static double divide(double i, double j){
        return i/j;
    }

    private static void controller(int operation, double firstNumber, double secondNumber){
        System.out.println("результат операции: ");
        switch (operation){
            case 1:
                System.out.println(sum(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println(diff(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println(multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println(divide(firstNumber, secondNumber));
                break;
            default:
                System.out.println("ошибка при выборе операции");
        }

    }

    
}
