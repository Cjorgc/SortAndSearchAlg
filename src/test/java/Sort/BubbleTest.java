package Sort;

import org.example.Sort.Bubble;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleTest {
    private static int [] array;

    @BeforeAll
    public static void init() {
        array = new int[20];
        for(int i = 0 ; i < array.length ; i++){
            array[i] = (int) Math.floor(Math.random() * 100);
        }
    }

    @Test
    public void bubbleOk(){
        Arrays.stream(array).forEach(System.out::print);
        Bubble.sort(array);
        System.out.println("------");
        Arrays.stream(array).forEach(System.out::print);
    }
    @Test
    public void bubbleok2(){
        Arrays.stream(array).forEach(System.out::print);
        Bubble.sort2(array);
        System.out.println("------");
        Arrays.stream(array).forEach(x -> System.out.print(x + ","));
    }
}
