//Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)


public class ex1 {
    public static void main(String[] args) {
        System.out.println(triangleSum(7));
        System.out.println(factorial(3));
    }


    public static int triangleSum(int number){
        int result = 0;
        for(int i = 0; i <= number; i++) result += i;
        return result;
    }

    public static int factorial(int number){
        int result = 1;
        for(int i = 1; i <= number; i++) result *= i;
        return result;
    }
}