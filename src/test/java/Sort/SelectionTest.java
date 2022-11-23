package Sort;

import org.example.Sort.Selection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SelectionTest {
    private static int [] array;

    @BeforeAll
    public static void init() {
        array = new int[100];
        for(int i = 0 ; i < array.length ; i++){
            array[i] = (int) Math.floor(Math.random() * 100);
        }
    }
    @Test
    public void selectionOk(){
        Selection.sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }
}
