package Sort;

import org.example.Sort.Merge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeTest {
    private static int [] array;
    private static int [] array2;

    @BeforeEach
    public  void init() {
        array = new int[20];
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
    public void mergeOk(){
        Merge.sort(array,0, array.length - 1);
        System.out.println("----");
        Arrays.stream(array).forEach(x -> System.out.print(x + ","));
        Assertions.assertEquals(0, Arrays.compare(array,array2));
    }
}
