class MinStack {
    int top;
    int min;

    record IntPair(int value, int min) {
    };

    ArrayList<IntPair> list;

    public MinStack() {
        top = -1;
        min = Integer.MAX_VALUE;
        list = new ArrayList<>();
    }

    public void push(int value) {
        this.top++;
        if (top == 0) {
            list.add(new IntPair(value, value));
            min = value;
        } else {
            IntPair p = list.get(top - 1);

            if (value < p.min ) {
                min = value;
                list.add(new IntPair(value, value));
            }else{
                 list.add( new IntPair(value, p.min));
            }
           
        }

    }

    public void pop() {
        list.remove(top);
        top--;

    }

    public int top() {

        IntPair pair = list.get(top);
        return pair.value;

    }

    public int getMin() {

        IntPair pair = list.get(top);
        return pair.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */