import java.util.*;
public class Exercises {
    public static void main() {
        Stack<Integer> ex1 = new Stack<Integer>();
        ex1.push(42);
        ex1.push(1);
        ex1.push(7);
        ex1.push(11);
        ex1.push(4);
        ex1.push(9);
        ex1.push(8);
        ex1.push(2);
        ex1.push(7);
        System.out.println(collapse(ex1));
        
        Queue<Integer> ex2 = new LinkedList<Integer>();
        ex2.add(1);
        ex2.add(2);
        ex2.add(-2);
        ex2.add(4);
        ex2.add(-5);
        ex2.add(8);
        ex2.add(-8);
        ex2.add(12);
        ex2.add(-15);
        System.out.println(reorder(ex2));
    }
    
    public static Stack<Integer> collapse (Stack<Integer> s) {
        Stack<Integer> n = new Stack<Integer>();
        while(!s.isEmpty()) {
            int n1 = s.pop();
            if (s.size() >= 1) {
                int n2 = s.pop();
                n.push(n1 + n2);
            } else {
                n.push(n1);
            }
        }
        return n;
    }
    
    public static Stack<Integer> reorder (Queue<Integer> s) {
        Stack<Integer> n = new Stack<Integer>();
        Queue<Integer> positive_numbers = new LinkedList<Integer>();
        Stack<Integer> negative_numbers = new Stack<Integer>();
        while (!s.isEmpty()) {
            int num = s.remove();
            if (num >= 0) {
                positive_numbers.add(num);
            }
            else {
                negative_numbers.push(num);
            }
        }
        while (!negative_numbers.isEmpty()) {
            n.push(negative_numbers.pop());
        }
        while(!positive_numbers.isEmpty()) {
            n.push(positive_numbers.remove());
        }
        return n;
    }
    
    public void mirrorHalves (Queue<Integer> q) {
       if(q == null || q.size() % 2 == 1)
           throw new IllegalArgumentException();
        
       Stack<Integer> s = new Stack<Integer>();
       int size = q.size();     
       for(int k = 0; k < 2; k++) {
            for(int i = 0; i < size / 2; i++) {
                int n = q.remove();
                q.add(n);
                s.push(n);
            }
            
            while(!s.isEmpty())
                q.add(s.pop());
       }
        
    }
}













