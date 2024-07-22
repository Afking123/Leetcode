public class MergekSortedLists {
    public static void main(String[] args) {
        ListNode[] in=new ListNode[2];
        ListNodePrinter(mergeKLists(in));
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode ans=new ListNode();
        ListNode anstart=ans;
        for(int i=0;i<lists.length;i++){
            //System.out.print(lists[i].val);
            while(lists[i]!=null){
                ans.next=lists[i];
                ans=ans.next;
                lists[i]=lists[i].next;
            }
        }
        ListNode result=new ListNode(anstart.val);
        anstart=anstart.next;
        while(anstart!=null){
            ListNode temp=new ListNode(anstart.val);
            inputer(result,temp);
            //ListNodePrinter(result);
            anstart=anstart.next;
        }
        return result.next;
    }
    public static void inputer(ListNode result,ListNode temp){
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