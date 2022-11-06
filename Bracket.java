import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter the input String");
        String input = scanner.next();
        isBalanced(input);
    }

    public static void isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c=='{' || c=='['){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    System.out.println("The entered Strings do not contain Balanced Brackets");
                    return;
            }
            char top = stack.peek();
            if ((top == '(' && c ==')') || (top == '{' && c =='}') || (top == '[' && c ==']')){
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){ 
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
