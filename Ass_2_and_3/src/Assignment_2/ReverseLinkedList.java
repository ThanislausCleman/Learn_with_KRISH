package Assignment_2;

public class ReverseLinkedList {
	
	private Node aa = null;
    private Node bb = null;

    //Adding a node to the list
    public void addNode(String data) {
        Node newNode = new Node(data);

        if(aa == null) {
            aa = newNode;
        }
        else {
            bb.next = newNode;
        }
        bb = newNode;
    }

    //Display all the nodes
    public void display() {
        Node current = aa;

        if(aa == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //Reverse from end node to the first node
    public void reverseList(){
        if(bb != null && aa != null){
            Node current = aa;
            Node previousNode = bb, nextNode = null;

            while(current != previousNode){
                previousNode.next = current;
                aa = current.next;
                bb = current;
                current.next = null;
                if (nextNode != null) {
                    bb.next = nextNode;
                }
                current = aa;
                nextNode = previousNode.next;
            }
        }
    }

}
