package Sort;

import org.example.Sort.BubbleRecursive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleRecursiveTest {
    private static int[] array;
    private static int[] array2;
    @BeforeAll
    public static void init() {
        array = new int[100];
        for(int i = 0 ; i < array.length ; i++){
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        array2 = array.clone();
        Arrays.stream(array).forEach(x -> System.out.print(x + ","));
        System.out.println("-------------");
        array2 = Arrays.stream(array2).sorted().toArray();
        Arrays.stream(array2).forEach(x -> System.out.print(x + ","));
    }

    @Test
    public void bubblerecursiveOk(){
        BubbleRecursive.sort(array, array.length);
        Assertions.assertEquals(0, Arrays.compare(array, array2));
    }
}
