package za.co.entelect.interview.java.questions.Question6;

/* Java 8 introduced serveral features and enhancements to make thread manipulation simpler and more efficient. Some key improvements are listed here.*/

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class ThreadManipulation {

    public void lambdaExpressions() {

        /* The introduction of lambda expressions simplify the creation of small inline functions. Lambda expressions can be used in conjunction with
         *  Java's functional interfaces being 'Runnable' and 'Callable' for defining more concise way of defining tasks to be executed in threads. */

        Runnable task = () -> {
            System.out.println("This is a runnable task.");
        };

    }

    public void functionalInterfaces() {

        /*Java 8 introduced functional interface is  the java.util.function packages such as Supplier, Consumer, Function & Predicate.
         *  These interfaces provide a common vocabulary for working with functions and lambdas. */

        // Using a Function to convert a string to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        String result = toUpperCase.apply("hello, world!");
        System.out.println(result);


        // Using a Consumer to print each name
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Consumer<String> printName = name -> System.out.println("Hello, " + name);
        names.forEach(printName);

        // Using a Supplier to generate a random number
        Supplier<Double> randomSupplier = Math::random;
        double randomValue = randomSupplier.get();
        System.out.println("Random value: " + randomValue);
    }

    public void streamApi() {
        /*  the stream API introduced in Java 8 allows for functional-style processing of collections. You can parallelize operations on stream using
         *   'parallelStream()' method which automatically ultilizes multiple threads to perform operations concurrently. */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.printf("Sum of value: %d%n", sum);
    }

    public void completableFuture(){
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 42)
                .thenApplyAsync(result -> result * 2)
                .exceptionally(ex -> {
                    System.err.println("Error: " + ex);
                    return 0;
                });
    }
}
