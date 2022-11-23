package Search;

import org.example.Search.Binary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinaryTest {

    private static int [] array;

    @BeforeAll
    public static void init() {
        array = new int[100];
        for(int i = 0 ; i < array.length ; i++){
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        Arrays.sort(array);
    }
    @Test
    public void binaryOk(){
        int result = Binary.search(array, 5, 0, array.length -1);
        System.out.println(result);
        Arrays.stream(array).forEach(System.out::println);
        Assertions.assertEquals(Arrays.stream(array).anyMatch(x -> x== 5), result != -1);
    }
}
