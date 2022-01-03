public class LinkedLists
{
    // Singly-linked lists are already defined with this interface:
    class ListNode<T>
    {
        ListNode(T x) { value = x; }
        T value;
        ListNode<T> next;
    }

    public ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2)
    {
        ListNode<Integer> head = new ListNode<Integer>(null);
        ListNode<Integer> p = head;

        while(l1 != null && l2 != null)
        {
            if(l1.value < l2.value)
            {
                p.next = l1;
                l1 = l1.next;
            }
            else
            {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if(l1 != null)
            p.next = l1;
        if(l2 != null)
            p.next = l2;

        return head.next;
    }
}
