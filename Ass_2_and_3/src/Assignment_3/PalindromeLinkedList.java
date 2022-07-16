package Assignment_3;

import java.util.Objects;

public class PalindromeLinkedList {
	
	private int size;   //Size of the list
    private Node aa = null;   //First Node
    private Node bb = null;   //Last Node

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
        size++;
    }

    //Reverse from end node to the first node
    public Node reverseList(Node temp){
        Node current = temp;
        Node previousNode = null, nextNode = null;

        while(current != null){
            nextNode = current.next;
            current.next = previousNode;
            previousNode = current;
            current = nextNode;
        }
        return previousNode;
    }

    //Check whether the given list Palindrome or not
    public void isPalindrome(){
        Node current = aa;
        boolean flag = true;
        int mid = 0;

        if(size % 2 == 0){
            mid = size / 2;
        } else {
            mid = (size + 1) / 2;
        }

        for(int i = 1; i < mid; i++){
            current = current.next;
        }

        Node reverseHead = reverseList(current.next);

        while(aa != null && reverseHead != null){
            if(!Objects.equals(aa.data, reverseHead.data)){
                flag = false;
                break;
            }
            aa = aa.next;
            reverseHead = reverseHead.next;
        }

        if(flag)
            System.out.println("Palindrome");
        else
            System.out.println("not a Palindrome");
    }

    //Display all the nodes
    public void display() {
        Node current = aa;

        if(aa == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        System.out.println("Nodes of linkedList: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
