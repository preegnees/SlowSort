import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String count = sc.nextLine();
        ArrayList<String> c = new ArrayList<>(
                Arrays.asList(count.split(" "))
        );
    }
}
