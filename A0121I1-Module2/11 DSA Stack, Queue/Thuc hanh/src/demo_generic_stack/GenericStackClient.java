package demo_generic_stack;

import demo_generic_stack.MyGenericStack;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        MyGenericStack.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        MyGenericStack.stackOfIStrings();
    }
}
