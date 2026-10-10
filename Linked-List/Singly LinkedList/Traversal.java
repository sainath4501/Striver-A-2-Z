/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public List<Integer> LLTraversal(ListNode head) {
        ArrayList ans=new ArrayList<>();
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            ans.add(temp.data);
            temp=temp.next;
            i++;
        }
        return ans;
    }
}