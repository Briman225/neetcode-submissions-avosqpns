class ListNode {
    int val;
    ListNode next;

    public ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        ListNode temp = head.next;
        for (int i = 0; temp != null; i++)
        {
            if (i == index)
            {
                return temp.val;
            }
            temp = temp.next;
        }

        return -1;
    }

    public void insertHead(int val) {
        ListNode new_node = new ListNode(val);
        new_node.next = head.next;
        head.next = new_node;
        if (new_node.next == null)
        {
            tail = new_node;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        ListNode temp = this.head;
        for (int i = 0; i < index && temp != null; i++)
        {
            temp = temp.next;
        }

        if (temp != null && temp.next != null)
        {
            if (temp.next == this.tail)
                this.tail = temp;

            temp.next = temp.next.next;
            return true;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ListNode temp = head.next;
        while (temp != null)
        {
            values.add(temp.val);
            temp = temp.next;
        }
        return values;
    }
}
