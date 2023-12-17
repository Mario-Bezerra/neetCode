import java.util.ArrayList;

class MinStack {

    ArrayList<Integer> stack = new ArrayList<>();
    int size = 0;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        size++;
    }
    
    public void pop() {
        stack.remove(size - 1);   
        size--;
    }
    
    public int top() {
        return stack.get(size - 1);
    }
    
    public int getMin() {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) < minValue) {
                minValue = stack.get(i);
            }
        }
        return minValue;
    }
}