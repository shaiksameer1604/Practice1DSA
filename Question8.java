import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine(); // Move to the next line after reading n

        Set<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String pair = scan.nextLine();
            uniquePairs.add(pair);
            System.out.println(uniquePairs.size());
        }

        scan.close();
    }
}

