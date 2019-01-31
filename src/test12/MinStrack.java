package test12;

import java.util.Stack;

/*
* 1. 保留上一次的最小值
* 2. 更新最小值
*
* */

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // 如果小于最小值min就push2个数据到栈中
        if ( x <= min ) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        // 如果拿出来的是最小值，就删除2个
        if ( stack.pop() == min ) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */