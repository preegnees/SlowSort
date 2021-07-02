import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вас приветсвует медленная программа сортировки \"от меньшего к большему\", не вводите слишком большие числа");
        while ( true ) {
            sort();
        }
    }
    private static void sort () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте промежуток для сортировки (1) или запишите массив (2)? ");
        String oneOrTwo = sc.nextLine();
        if ( oneOrTwo.equals("1") ) {
            System.out.println("Введите промежуток цифр от и до (2 цифры), которые будут составлять массив, через пробел");
            String count = sc.nextLine();
            ArrayList<String> c = new ArrayList<>(
                    Arrays.asList(count.split(" "))
            );
            int c1 = new Integer(c.get(0));
            int c2 = new Integer(c.get(1));
            if ( (c1 > c2) ) {
                System.out.println("Введите 2 числа от меньшего к большему, через пробел");
                count = sc.nextLine();
                c = new ArrayList<>(
                        Arrays.asList(count.split(" "))
                );
                c1 = new Integer(c.get(0));
                c2 = new Integer(c.get(1));
            }
            justSort js = new justSort(c1, c2, oneOrTwo);
            ArrayList<Integer> sorted = js.raspredSort();
            System.out.println(sorted);
        } else if ( oneOrTwo.equals("2") ) {
            System.out.println("Введите массив, без запятых через пробел");
            String array = sc.nextLine();
            justSort js = new justSort(array, oneOrTwo);
            ArrayList<Integer> sorted = js.raspredSort();
            System.out.println(sorted);
        }
    }
}
