package queue;

//用数组实现一个队列
public class QueueBasedOnArray {
    //items 为定义的数组 n为数组的大小
    private String[] items;
    private int n;
    //head是出队的元素的角标 tail是入队的元素的角标
    private  int head;
    private  int tail;

    //构造函数 初始化队列
    public QueueBasedOnArray(int n) {
        this.items = new String[n];
        this.head = 0;
        this.tail = 0;
    }


    // 入队操作，将item放入队尾
    public boolean enqueue(String item) {
        // tail == n表示队列末尾没有空间了
        if (tail == n) {
            // tail ==n && head==0，表示整个队列都占满了
            if (head == 0) return false;
            // 数据搬移
            for (int i = head; i < tail; ++i) {
                items[i-head] = items[i];
            }
            // 搬移完之后重新更新head和tail
            tail -= head;
            head = 0;
        }

        items[tail] = item;
        ++tail;
        return true;
    }

    //出队 从数组的开头移除元素
    public String  dequeue() {
        //判断队列是否为空
        if (head == tail) {
            return  null;
        }
        String res = items[head];//注意这里是没有进行数据搬移的
        head++;
        return res;
    }

}
