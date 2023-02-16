//Вывести все простые числа от 1 до 1000

public class ex2 {
    public static void main(String[] args) {
        primeNumbers(1000);
    }

    public static void primeNumbers(int n){
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            if (isPrime(i)){
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());

    }

    private static boolean isPrime(int number){
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
