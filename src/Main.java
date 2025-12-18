public class Main {


    // Steps to create a variable in Java
    // ----------------------------------
    // 1. Declaration
    // 2. Assignment

    // 🟥 Primitive = simple value stored directly in memory (stack)
    // 🟦 Reference = memory address (stack) that points to the (heap)

    // 🟥 Primitive vs 🟦 Reference
    //    ---------       ---------
    //    int             string
    //    double          array
    //    char            object
    //    boolean

    public static void main(String[] args) {

        int count = 30;

        System.out.println("I like pizza!");
        System.out.println("It's really good. I ate " + count + " pizzas last year");
    }
}
