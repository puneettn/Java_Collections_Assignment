package Java_Collections_Assignment;

import java.util.ArrayList;

//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
public class Question_3 {

    ArrayList<Integer> li = new ArrayList<>();
    int capacity = 0;
    int total_cap = 0;

    void push(int a) {
        li.add(a);
        capacity++;
        total_cap++;
    }

    public Boolean pop() {
        if (li.isEmpty()) {
            return false;
        }
        Integer top = li.get(li.size() - 1);
        li.remove(li.size() - 1);
        capacity--;
        return true;

    }

    void Display() {
        for (int i = capacity - 1; i >= 0; --i)
            System.out.print(li.get(i) + " ");
    }

    void getMin() {
        if (!li.isEmpty()) {
            int minimum = li.get(0);
            for (int i = 1; i < li.size(); i++) {
                if (minimum > li.get(i))
                    minimum = li.get(i);
            }
            System.out.println(minimum);
        } else System.out.println("Empty Stack");
    }

    Boolean isFull() {
        if (total_cap == li.size())
            return true;
        else
            return false;
    }

    Boolean isEmpty() {
        if (total_cap > capacity)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Question_3 Stack = new Question_3();
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        Stack.push(60);
        Stack.push(70);
        Stack.push(80);
        Stack.push(90);
        Stack.push(100);
        Stack.push(110);

        Stack.Display();
        System.out.println("\nis full : " + Stack.isFull());
        System.out.println("is empty : " + Stack.isEmpty());


        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.Display();
        System.out.println("\nis full : " + Stack.isFull());
        System.out.println("is Empty : " + Stack.isEmpty());

        System.out.print("min is :");
        Stack.getMin();
    }
}