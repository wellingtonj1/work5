package com.work5;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // clear console
        helper.print("\033[H\033[2J");
        
        // create stack
        Stack<Character> charStack = new Stack<Character>();

        // push elements from scan
        helper.print("Enter a string: ");
        String str = helper.scan().nextLine();

        Integer i = 0;
        
        for (i = 0; i < str.length()/2; i++) {
            charStack.push(str.charAt(i));
        }

        if (str.length() % 2 == 1) {
            i++;
        }

        for (; i < str.length(); i++) {
            if (str.charAt(i) == charStack.peek()) {
                charStack.pop();
            } else {
                helper.print("Not palindrome");
                break;
            }
        }

        if (charStack.isEmpty()) {
            helper.print("Palindrome");
        }

    }
}
