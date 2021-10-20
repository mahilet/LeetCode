class MyLinkedList {
    Node head;
    int length;
    
    class Node 
    {
        int val;
        Node next;
        
        Node(int data)
        {
            this.val = data;
            this.next = null;
        }
    }
//MyLinkedList() Initializes the MyLinkedList object.
    public MyLinkedList() {
        this.head = null;
        length = 0;
    }
   
//int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
    public int get(int index) {
        
        Node current = head;
        int counter = 0;
        if(index<0 || index >length)
        {
           return - 1;
        }
        while(counter < index)
        {
            counter ++;
           current = current.next;
        }
        
        return current.val;
    }
//void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        length++;
    }
//void addAtTail(int val) Append a node of value val as the last element of the linked list.    
    public void addAtTail(int val) 
    {
        Node newNode = new Node(val);
        newNode.next = null;
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next  = newNode;
    }
 //void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. 
 //If index equals the length of the linked list, the node will be appended to the end of the linked list. 
 //If index is greater than the length, the node will not be inserted.
   
    public void addAtIndex(int index, int val) {
        
        int counter = 1;
        Node current = head;
        if(index <0 || index > length)
        {
            return; 
        }
        Node newNode = new Node(val);
        Node temp = current;
        
        while(counter < index)
        {
            counter ++;
            current= current.next;
        
        }
          temp.next = newNode;
          newNode.next= current;
          
    }

//void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
    public void deleteAtIndex(int index) 
    {
     Node current = head;
	 Node temp= current;
	 int counter =1;
	
	 if(index <0 || index>=length)
	 {
	   return ;
		 
	 }
	 while(counter <index-1)
	 {
       counter++;
		 current = current.next;				
	 }
	 temp = current.next;
	 current.next= temp.next;
	 temp= null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
