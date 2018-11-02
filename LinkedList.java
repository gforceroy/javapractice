import java.io.File;
import java.util.Scanner;

class Node
{
  public int data;
  public Node next;
  public Node(int d)
  {
    data = d;
    next = null;
  }
}

public class LinkedList {
	public Node head;
	public int listLen;

	public LinkedList(){
		head = null;
		listLen = 0;
	}

	public void show(){
		Node current = head;
		while(current.next!=null){
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		System.out.println(current.data);
	}


  public void add(int d){
    if (head == null)
      head = new Node(d);
    else {
      Node end = new Node(d);
      Node current = head;
      while(current.next != null){
        current = current.next;
      }
      current.next = end;
      listLen++;
    }
  }

    public static void main(String[] args) {
      LinkedList L = new LinkedList();

      try {
           // File file = new File("in.txt");
           Scanner scn = new Scanner(new File("in.txt"));

           while(scn.hasNextInt()){
             L.add(scn.nextInt());
             // System.out.println( scn.nextInt());
           }

       } catch (Exception ex) {
           ex.printStackTrace();
       }


    	L.show();
    }
}
