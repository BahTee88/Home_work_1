import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String geeksAndroid;
        final int NUM = 56;
        String word = (" students ");
        geeksAndroid = NUM + word;
        System.out.println(geeksAndroid);


        if (NUM < 0) {
            System.out.println(" Вы сохранили отрицательное число ");
        } else if (NUM > 0) {
            System.out.println(" Вы сохранили положительное число ");
        } else {
            System.out.println("Вы сохранили ноль");

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String result = scanner.nextLine();
        System.out.println("Hi " + result);
    }

}

