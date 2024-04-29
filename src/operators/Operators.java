package operators;

public class Operators {

    // create an add method for Operators.Operators class
    public int add(int a, int b) {
        return a + b;
    }

    // create a subtract method for Operators.Operators class
    public int subtract(int a, int b) {
        return a - b;
    }

    // create a multiplication method for Operators.Operators class
    public int multiply(int a, int b) {
        return a * b;
    }

    // create a division method for Operators.Operators class
    public float divide(float a, float b) {
        return a / b;
    }

    // create a modulus method for Operators.Operators class
    public int modulus(int a, int b) {
        return a % b;
    }

    // create a method to negate an integer passed in
    public int negate(int a) {
        return -a;
    }

    // create a method to set a passed value to +ve
    public int positive(int a) {
        return +a;
    }

    // create a method to increment the passed in parameter
    public int increment(int a) {
        return ++a; // pre incremental results in 11
        // return a++; // post incremental results in 10
    }

    // create a method to decrement the passed in parameter
    public int decrement(int a) {
        return --a; // pre decrement results in 9
        // return a-- // post decrement results in 10
    }

    // create a method to apply the not operation on the parameter
    public boolean not(boolean a) {
        return !a;
    }

    // static method to display arithmetic operations results
    public static void displayResults(int data) {
        System.out.println(data);
    }

    public static void displayFloatResults(float data) {
        System.out.println(data);
    }

    public static void displayBooleanResults(boolean data) {
        System.out.println(data);
    }

//        System.out.println(addResult);
//        System.out.println(subtractResult);
//        System.out.println(multiplyResult);
//        System.out.println(divideResult);
//        System.out.println(modulusResult);

//        System.out.println(ops.add(10, 10));
//        System.out.println(ops.subtract(10,5));
//        System.out.println(ops.multiply(10,10));
}

