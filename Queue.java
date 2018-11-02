public class Node
{
  public int data;
  public Node next;
  public Node(int d, Node n)
  {
    data = d;
    next = n;
  }
}




public class Queue
{

  //linked list stuff
  public Node head, tail; //beginning and end of queue need access elsewhere
  private int N;   // number of elements on queue


  /**
   * Initializes a queue.
   */
  public Queue(){
    head = null;
    tail = null;
    N = 0;
  }
  /**
   * returns the size
   */
  public int size(){
    return N;
  }

  /**
   * adds s to the back of the queue
   */
  public void enqueue(Section s){
    if (head == null)
      head = tail = new Node(s,null);
    else{
      tail.next = new Node(s,null);
      tail = tail.next;
    }
  }

  /**
   * removes and returns string from the front of the queue
   */
  public Section dequeue(){
    Node t = head;
    head = head.next;
    if (head == null)
      tail = null;
    return t.data;
  }

  /**
   * removes and returns string from the front of the queue
   */
  public boolean empty(){
    return head == null;
  }


  /**
   * Returns the item least recently added to this queue
   */
  public Section peek()
  {
    return head == null ? null : head.data;
  }


  /**
   * finds what you want from queue
   * then returns that item back to the queue
   */
  public void Find(String nm, Queue Q) {
    Node temp = head;

    while( temp != null ) {
      Section s = temp.data;
      if (nm.equals(s.name)) {
	System.out.println(s.name + " " + s.sec + " " + s.meetim + " " + s.rmnum);
      }
      temp = temp.next;
    }
  }

  /**
   * Print the whole queue
   */
  public void PrintAll(Queue Q) {
    Node temp = head;
    while( temp != null ){
      Section s = temp.data;
      System.out.println(s.name + " " + s.sec + " " + s.meetim + " " + s.rmnum);
    }
    temp = temp.next;
  }


}
