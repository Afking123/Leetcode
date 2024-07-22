public class llllll {
        public static void main(String[] args) {
            // 創建一個 ListNode 陣列，大小為 3
            ListNode[] listNodes = new ListNode[3];
    
            // 初始化陣列中的每一個 ListNode
            listNodes[0] = new ListNode(1);
            listNodes[1] = new ListNode(2);
            listNodes[2] = new ListNode(3);
    
            // 連結這些節點
            listNodes[0].next = listNodes[1];
            listNodes[1].next = listNodes[2];
            // 遍歷並打印鏈結串列
            ListNode current = listNodes[0];
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
        }
    }

