import java.util.Comparator;
import java.util.TreeSet;

public class _011_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(10);
        set.add(9);
        set.add(19);
        set.add(14);
        set.add(7);
        set.add(29);
        System.out.println("Original set: " + set);

        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());
        System.out.println("Contains 14? " + set.contains(14));
        System.out.println("Higher than 14: " + set.higher(14));
        System.out.println("Lower than 14: " + set.lower(14));
        System.out.println("Size: " + set.size());

        set.remove(19);
        System.out.println("After removing 19: " + set);

        set.clear();
        System.out.println("After clear, is empty? " + set.isEmpty());
    }
}