package Assignment_3;

public class PalindromeMain {
	
	public static void main(String[] a){

        PalindromeLinkedList LinkedList1 = new PalindromeLinkedList();
        PalindromeLinkedList LinkedList2 = new PalindromeLinkedList();

        
        //List 1
        LinkedList1.addNode("R");
        LinkedList1.addNode("A");
        LinkedList1.addNode("C");
        LinkedList1.addNode("E");
        LinkedList1.addNode("C");
        LinkedList1.addNode("A");
        LinkedList1.addNode("R");

        
        //List 2
        LinkedList2.addNode("R");
        LinkedList2.addNode("A");
        LinkedList2.addNode("C");
        LinkedList2.addNode("E");
        LinkedList2.addNode("E");
        LinkedList2.addNode("A");
        LinkedList2.addNode("R");
        
        

        System.out.println("Given LinkedList 1");
        LinkedList1.isPalindrome();

        System.out.println("Given LinkedList 2");
        LinkedList2.isPalindrome();
 
    }


}
