

public class RemoveNthNode {
    public static void main(String[] args) {
        int[] head = {1, 2, 3, 4, 5,6,7,8,9};
        ListNode dummy = new ListNode();  // 创建一个哑节点
        ListNode current = dummy;         // 初始化当前指针为哑节点

        // 迭代数组并创建链表
        for (int num : head) {
            current.next = new ListNode(num);  // 创建新节点并链接到当前节点
            current = current.next;            // 移动当前指针到新创建的节点
        }

        // 遍历链表以验证结果
        ListNode in = dummy.next;  // 忽略哑节点，获取实际链表头部
        ListNode out=removeNthFromEnd(in,2);
        while (out != null) {
            System.out.print(out.val);
            out = out.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode count=head;
        ListNode ans=new ListNode();
        ListNode ans1=ans;
        int headmax=0;
        while(count!=null){
            headmax++;
            count=count.next;
        }
        int point=headmax-n;
        for(int i=0;i<point;i++){
            //System.out.println("t:"+head.val);
            ans.next=new ListNode(head.val);
            ans=ans.next;
            head=head.next;
        }
        ans.next=head.next;
        ans1=ans1.next;
        //System.out.println("test:"+head.next.next.next.val);
        //System.err.println(headmax);
        return ans1;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}