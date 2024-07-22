public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode in1=new ListNode(1);
        in1.next=new ListNode(2);
        in1.next.next=new ListNode(4);
        ListNode in2=new ListNode(1);
        in2.next=new ListNode(3);
        in2.next.next=new ListNode(4);
        ListNodePrinter(mergeTwoLists(in1,in2));
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null){return list2;}
        ListNode ans=new ListNode(0);
        ans.next=list1;
        while(list2!=null){
            ListNode temp=new ListNode(list2.val);
            inputer(ans,temp);
            list2=list2.next;
        }
        return ans.next;
    }
    public static void inputer(ListNode result,ListNode temp) {
        if(result.next==null){
            result.next=temp;
            return;
        }
        if(temp.val>result.next.val){
            inputer(result.next,temp);
        }else{
            temp.next=result.next;
            result.next=temp;
            return;
        }
    }
    public static void ListNodePrinter(ListNode in){
        if(in==null){
            System.out.println("");
            return;
            }
        System.out.print(in.val);
        ListNodePrinter(in.next);
    }
}
