package java8.functionalProgramming;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Function<T, R> is a functional interface with abstract method: R apply(T t)
 *
 * Stream interface has following method:
 *    Stream<R> map(Function<? super T,? extends R> function)
 *
 * @author ankitasaklani
 */
public class FunctionExample {
    static List<Integer> list = List.of(2, 5, 4, 3, 7, 8, 4, 5, 7, 9, 10);

    public static void main(String[] args) {
        /**
         * older way to write a function
         * Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
         *
         *             @Override
         *             public Integer apply(Integer x) {
         *                 return x * x;
         *             }
         *         };
         */

        /**
         * Java 8 method to define a Function using Lambda function
         */
        Function<Integer, Integer> squareFunction = x -> x * x;
        System.out.println(filterAndPrint(squareFunction));

        Function<Integer, Integer> cubeFunction = x -> x * x * x;
        System.out.println(filterAndPrint(cubeFunction));

        Function<Integer, String> numberFunction = x -> "my number is "+x;
        list.stream().map(numberFunction).forEach(System.out::println);


    }

    private static List<Integer> filterAndPrint(Function<Integer, Integer> mappingFunction) {
        return list.stream().map(mappingFunction).collect(Collectors.toList());
    }

}