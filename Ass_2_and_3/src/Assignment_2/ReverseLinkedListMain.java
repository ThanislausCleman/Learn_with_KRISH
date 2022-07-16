package Assignment_2;

public class ReverseLinkedListMain {
	
	public static void main(String[] a){

        ReverseLinkedList LinkedList1 = new ReverseLinkedList();
        ReverseLinkedList LinkedList2 = new ReverseLinkedList();

        //List 1
        LinkedList1.addNode("A");
        LinkedList1.addNode("B");
        LinkedList1.addNode("C");
        LinkedList1.addNode("D");
        LinkedList1.addNode("E");
        LinkedList1.addNode("F");

        //List 2
        LinkedList2.addNode("L");
        LinkedList2.addNode("M");
        LinkedList2.addNode("N");
        LinkedList2.addNode("O");
        LinkedList2.addNode("P");
        LinkedList2.addNode("Q");
        LinkedList2.addNode("R");

        //Printing List 1
        System.out.println("Before Reverse the LinkedList");
        LinkedList1.display();
        LinkedList1.reverseList();
        System.out.println("After Reverse the LinkedList");
        LinkedList1.display();

        System.out.println();
        System.out.println();

        //Printing List 2
        System.out.println("Before Reverse the LinkedList");
        LinkedList2.display();
        LinkedList2.reverseList();
        System.out.println("After Reverse the LinkedList");
        LinkedList2.display();

    }

}
