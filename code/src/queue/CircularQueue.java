package queue;

//实现一个简单的循环队列
public class CircularQueue {

    private String[] items;
    private int n;
    private int head;
    private int tail;

    public CircularQueue(int capacity) {
        //初始化数组
        this.items = new String[capacity];
        this.n = capacity;
    }

    //入队操作
    public boolean enqueue(String item) {
        //判断队列是否满员
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    //出队操作
    public String dequeue() {
        //判断队列是否为空
        if (head == tail) {
            return null;
        }
        String res = items[head];
        head = (head + 1) % n;
        return res;
    }
}
