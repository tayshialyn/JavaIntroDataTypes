package typeCasting;

public class NarrowTypeCasting {
    public static void main(String[] args) {

        double d = 100.94;     // declare a variable d of type double with a value of 100.94
        long l = (long)d;     // explicit typecasting
        int i = (int)l;       // explicit typecast to int

        // Print d, l and i
        System.out.println("double value: " + d);
        System.out.println("long value: " + l);
        System.out.println("int value: " + i);
    }
}
