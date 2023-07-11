package CrackYourPlacement;


import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    public Queue<Integer> s1 = new LinkedList<>();
    public Queue<Integer> s2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        while(!s1.isEmpty()){
            s2.add(s1.remove());
        }
        s1.add(x);
        while(!s2.isEmpty()){
            s1.add(s2.remove());
        }
    }

    public int pop() {
        if(!s1.isEmpty()){
            return s1.remove();
        }
        return -1;
    }

    public int top() {
        if(!s1.isEmpty()){
            return s1.peek();
        }
        return -1;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */