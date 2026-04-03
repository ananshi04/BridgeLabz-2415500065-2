package Queue;

class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class CIrcular_queue {
	node front;
	node rear;
	void enque(int data) {
		node newNode=new node(data);
		if(front==null) {  //if queue is empty
			front=newNode;
			rear=newNode;
			rear.next=front;
			return;
		}
		rear.next=newNode; //add an new element
		rear=newNode;
		rear.next=front;
	}
	void deque(int data) { //delete from the starting only
		if(front==null) {
			System.out.println("Queue is empty");
			return;
		}
		if(front == rear){
            front = rear = null;
            return;
        }
        front = front.next;
        rear.next = front;
    }
	void display() {
		if(front==null) {
			System.out.println("circular queue is empty");
			return;
		}
		
		 node temp = front;
	        while(temp.next != front){
	            System.out.println(temp.data);
	            temp = temp.next;
	        }
	        System.out.println(temp.data);
	    }
	    public static void main(String[] args) {
	    	CIrcular_queue q =new CIrcular_queue();
	    	q.enque(10);
	        q.enque(20);
	        q.enque(30);
	        q.deque(0);
	        q.display();
	    }	
	}
