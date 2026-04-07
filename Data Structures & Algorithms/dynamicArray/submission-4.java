class DynamicArray {
    private int capacity;
    private int[] arr;
    private int size;
    public DynamicArray(int capacity) {
        if (capacity > 0)
        {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.size = 0;
        }
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity)
            resize();
        
        this.arr[this.size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        return this.arr[this.size];
    }

    private void resize() {
        this.capacity *= 2;
        int[] new_arr = new int[this.capacity];
        for (int i = 0; i < this.size; i++)
        {
            new_arr[i] = this.arr[i];
        }
        this.arr = new_arr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
