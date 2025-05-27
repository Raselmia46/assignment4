import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallestElement {

    public static int findKthSmallest(ArrayList<Integer> list, int k) {
        if (k <= 0 || k > list.size()) {
            throw new IllegalArgumentException("k is out of bounds");
        }
        Collections.sort(list); // Sort the list
        return list.get(k - 1); // k-th smallest is at index k-1
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        try {
            int kthSmallest = findKthSmallest(list, k);
            System.out.println("The " + k + "th smallest element is: " + kthSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
