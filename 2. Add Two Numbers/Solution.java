
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l1_temp = l1;
        ListNode l2_temp = l2;
        ListNode result = new ListNode(0);
        int addition = 0;
        ListNode result_head = result;
        
        while(l1_temp!=null || l2_temp!=null){
   
            int l1_val = l1_temp ==null ? 0 : l1_temp.val;
            int l2_val = l2_temp ==null ? 0 : l2_temp.val;
         
            result.val = (l1_val + l2_val+addition);
            addition = result.val/10;
            result.val %= 10;
            
            
            l1_temp = l1_temp == null ? null : l1_temp.next;
            l2_temp = l2_temp == null ? null : l2_temp.next;

            if((l1_temp!=null || l2_temp!=null ) || addition != 0){
                ListNode result_node = new ListNode(0);
                result.next = result_node;
                result = result.next;
            }
            
        }
        if(addition !=0)
            result.val = addition;

        return result_head;

    }

    public static void printResult(ListNode result){
        while(result != null){
            System.out.print(result.val);
            result = result.next;
        }
    }

    public static void main(String [] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = addTwoNumbers(l1, l2);
        
        printResult(result);
        


    }
}