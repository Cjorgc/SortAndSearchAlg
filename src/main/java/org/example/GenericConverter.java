package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GenericConverter {
    private final static Map<String, Method> CONVERTERS = new HashMap<>();

    static {
        Method[] methods = GenericConverter.class.getMethods();
        for(Method method : methods){
            if(method.getParameterCount() == 1){
                CONVERTERS.put(method.getParameterTypes()[0].getName() + "to" + method.getReturnType().getName(), method);
            }
        }
    }

    public static <T> T convert(Object from, Class<T> to){
        if(from == null) return null;

        if(to == null){
            throw new IllegalArgumentException("Cannot convert, Class destination to convert is null");
        }

        if(to.isAssignableFrom(from.getClass())){
            return to.cast(from);
        }

        String convertId = from.getClass().getName() + "to" + to.getName();
        Method converter = CONVERTERS.get(convertId);
        if(converter == null){
            throw new UnsupportedOperationException("Cant cast from " + from.getClass().getName() + " to " + to.getName());
        }
        try{
            return to.cast(converter.invoke(to, from));
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static Boolean integerToBoolean(Integer value) {
        return value.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
    }
    public static Integer booleanToInteger(Boolean value) {
        return value.booleanValue() ? Integer.valueOf(1) : Integer.valueOf(0);
    }
    public static BigDecimal doubleToBigDecimal(Double value) {
        return new BigDecimal(value.doubleValue());
    }
    public static Double bigDecimalToDouble(BigDecimal value) {
        return value.doubleValue();
    }
    public static String integerToString(Integer value) {
        return value.toString();
    }
    public static Integer stringToInteger(String value) {
        return Integer.valueOf(value);
    }
    public static String booleanToString(Boolean value) {
        return value.toString();
    }
    public static Boolean stringToBoolean(String value) {
        return Boolean.valueOf(value);
    }
    public static String floatToString(Float value){
        return value.toString();
    }
    public static String doubleToString(Double value){
        return value.toString();
    }
    public static Float stringToFloat(String str){
        return Float.valueOf(str);
    }
    public static Double stringToDouble(String str){
        return Double.valueOf(str);
    }
}
