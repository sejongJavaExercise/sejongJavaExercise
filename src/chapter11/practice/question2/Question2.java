package chapter11.practice.question2;

import java.util.ArrayList;
import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) { arr1.add(i + 1); }
        for (int i = 0; i < 10; i++) { stack.push(arr1.get(i)); }
        for (int i = 0; i < 10; i++) { arr2.add(stack.pop()); }
        System.out.println("arr1 : " + arr1);
        System.out.println("arr2 : " + arr2);
    }
}
