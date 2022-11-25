import org.example.GenericConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericParserTest {
    @Test
    public void floatToString(){
        Float floatFrom = 12387F;
        String converted = GenericConverter.convert(floatFrom, String.class);
        Assertions.assertEquals("12387.0", converted);
    }
    @Test
    public void nullFloatToString(){
        Float floatFrom = null;
        String converted = GenericConverter.convert(floatFrom, String.class);
        Assertions.assertEquals(null, converted);
    }
    @Test
    public void doubleToString(){
        Double doubleFrom = 5.5;
        String converted = GenericConverter.convert(doubleFrom, String.class);
        Assertions.assertEquals("5.5", converted);
    }
    @Test
    public void nullDoubleToString(){
        Double doubleFrom = null;
        String converted = GenericConverter.convert(doubleFrom, String.class);
        Assertions.assertEquals(null, converted);
    }

    @Test
    public void stringToFloat(){
        String fromString = "42876F";
        Float converted = GenericConverter.convert(fromString, Float.class);
        Assertions.assertEquals(42876.0F, converted);
    }
    @Test
    public void stringToDouble(){
        String fromString = "42876F";
        Double converted = GenericConverter.convert(fromString, Double.class);
        Assertions.assertEquals(Double.valueOf(42876.0), converted);
    }

    @Test
    public void nullsToDoubleAndFloat(){
        String fromString = null;
        Double doubleConverted = GenericConverter.convert(fromString, Double.class);
        Float floatConverted = GenericConverter.convert(fromString, Float.class);

        Assertions.assertEquals(null, floatConverted);
        Assertions.assertEquals(null, doubleConverted);
    }
}
