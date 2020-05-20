package stack;



//用链表实现一个简单的栈
public class StackBasedOnLinkedList {

    //创建一个空链表作为头
    private Node top = null;

    //压栈操作
    public void push(int val) {
        Node new_node = new Node(val);
        //链表为空的情况
        if (top == null) top = new_node;
        //链表不为空
        if (top != null) {
            new_node.next = top;
            top = new_node;//将新的节点放在链表的头部
        }
    }

    //弹栈操作 删除的时候从头部开始删除
    public int pop() {
        //链表为空
        if(top == null) return -1;//用-1表示栈内没有元素
        //链表不为空
        if (top != null) {
            int value = top.val;
            top = top.next;
            return value;
        }
        return -1;
    }

}
