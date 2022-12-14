package Sort;

import org.example.Sort.Bubble;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleTest {
    private static int [] array;
    private static int [] array2;

    @BeforeEach
    public  void init() {
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
    public void bubbleOk(){
        Bubble.sort(array);
        Assertions.assertEquals(0, Arrays.compare(array, array2));

    }
    @Test
    public void bubbleok2(){
        Bubble.sort2(array);
        Assertions.assertEquals(0, Arrays.compare(array, array2));
    }
}
