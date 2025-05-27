import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListEqualityChecker {

    // Generic method to compare two LinkedLists
    public static <T> boolean areEqual(LinkedList<T> list1, LinkedList<T> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        Iterator<T> it1 = list1.iterator();
        Iterator<T> it2 = list2.iterator();

        while (it1.hasNext() && it2.hasNext()) {
            T val1 = it1.next();
            T val2 = it2.next();
            if (!val1.equals(val2)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();

        listA.add(10);
        listA.add(20);
        listA.add(30);

        listB.add(10);
        listB.add(20);
        listB.add(30);

        System.out.println("List A: " + listA);
        System.out.println("List B: " + listB);

        if (areEqual(listA, listB)) {
            System.out.println("The LinkedLists are equal.");
        } else {
            System.out.println("The LinkedLists are NOT equal.");
        }
    }
}
