package stack;

//用数组来实现一个顺序栈
public class OrderStack {

    private String[] items; //数组
    private int count; //栈中元素的个数
    private int n; //栈的大小

    //构造函数 创建数组
    OrderStack(int n) {
        this.items = new String[n];
        this.count = 0;
        this.n = n;
    }

    //实现压栈操作
    public boolean push(String item) {
        //数组空间不够 返回false
        if(count == n) return false;
        //数组空间够 加入
        if (count < n) {
            items[count] = item;
            count++;
        }
        return true;
    }

    //实现弹栈操作
    public String pop() {
        //如果栈是空的 返回null
        if (count == 0) return null;
        if (count > 0) {
            count--;
            return items[count];
        }
        return null;
    }

}
