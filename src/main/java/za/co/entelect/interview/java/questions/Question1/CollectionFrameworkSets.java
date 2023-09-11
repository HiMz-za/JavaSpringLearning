package za.co.entelect.interview.java.questions.Question1;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@Component
public class CollectionFrameworkSets {

    /* A set is a collection that does not allow duplicate elements. Sets are useful when you need to store group of unique values. */

    public void hashSet() {
        // implementation of HashSet is implemented using a hash table.
        // Unordered collection of elements.
        // Provides constant-time (O(1)) average for basic operations (add, remove, contains)
        // Allows one null element.
        //Use hash set when you need to store unique values in an unordered fashion.

        Set<String> fruitHashSet = new HashSet<>();
        // Add elements to the set
        fruitHashSet.add("apple");
        fruitHashSet.add("banana");
        fruitHashSet.add("cherry");

        // Adding a duplicate element, which will be ignored
        fruitHashSet.add("banana");

        for (String fruit : fruitHashSet) {
            System.out.println(fruit);
        }

        boolean containsBanana = fruitHashSet.contains("banana");
        System.out.println("Contains 'banana': " + containsBanana);

    }

    public void treeSet() {
        // TreeSet is implemented as a self-balancing red-black tree.
        // Stores elements in a sorted(natural) order according to a provided comparator.
        // Provides log(n) time complexity for basic operations (add,remove,contains).
        // Does not allow null elements.
        // Use for scenarios where you need to store elements in a sorted order or a custom order.

        // Create a TreeSet of integers
        Set<String> fruitTreeSet = new TreeSet<>();

        // Add elements to the set
        fruitTreeSet.add("apple");
        fruitTreeSet.add("banana");
        fruitTreeSet.add("cherry");

        // Iterate through the set (sorted order)
        for (String fruit : fruitTreeSet) {
            System.out.println(fruit);
        }

        // Check if an element exists in the set
        boolean containsApple = fruitTreeSet.contains("apple");
        System.out.println("Contains apple: " + containsApple);
    }

    public void linkedHashSet() {
        // LinkedHashSet is implemented as a hash table with a linked list that maintains the insertion order.
        //Stores elements in the order they were inserted.
        //Provides constant time (O(1)) average for basic operations (add,remove, contains)
        //Allows one null elements.

        // Create a LinkedHashSet of characters
        Set<String> fruitLinkedHashSet = new LinkedHashSet<>();

        // Add elements to the set
        fruitLinkedHashSet.add("apple");
        fruitLinkedHashSet.add("banana");
        fruitLinkedHashSet.add("cherry");

        // Adding a duplicate element, which will be ignored
        fruitLinkedHashSet.add("banana");

        // Iterate through the set (order of insertion is maintained)
        for (String fruit : fruitLinkedHashSet) {
            System.out.println(fruit);
        }

        // Check if an element exists in the set
        boolean containsCherry = fruitLinkedHashSet.contains("cherry");
        System.out.println("Contains cherry: " + containsCherry);

    }

}
