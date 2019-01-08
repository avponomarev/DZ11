import java.util.Scanner;

public class delspace {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с клавиатуры используя пробелы");
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        s = s.replaceAll("\\s+","");
        System.out.println("Введенная строка записана в переменную и выведенна на экран без пробелов:");
        System.out.println(s);

    }
}