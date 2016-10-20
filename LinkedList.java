import java.io.PrintWriter;

public class LinkedList {
	ListNode ListHead; 
	
	public LinkedList(String data){
		ListHead=new ListNode(data);
	}
	/**
	public ListNode findSpot(ListNode head,String data){
		ListNode spot = new ListNode();
		
		spot=head;
		while(spot !=null){
		if (spot.next !=null && data.compareToIgnoreCase(spot.data)>0)
			spot=spot.next;
		else
			return spot;
		}
		return spot;
	}	
	*/	
	
	
	public ListNode findSpot(String data){

		ListNode spot = ListHead;
		
		while (spot.next != null) {
			if (spot.next.data.compareToIgnoreCase(data) > 0)
				return spot;
			else if (spot.next.data.compareToIgnoreCase(data) == 0)
				return spot.next;
			else 
				spot = spot.next;
		}
		
		return spot;
	/*	while(spot !=null){
		if ( (spot.next !=null) && (data.compareToIgnoreCase(spot.data) > 0))
			spot=spot.next;
		else 
			return spot;
		}
		return spot; */
	}
	
	
	public void ListInsert (ListNode spot,ListNode newNode){
		if(spot.data.compareToIgnoreCase(newNode.data)==0){
			spot.count++;
			
		}
		else {
			newNode.next=spot.next;
			spot.next=newNode;
		}
	}
	
	public void printList( PrintWriter p, String s){

		ListNode n= ListHead;
		p.println("InsertedData   ("+s+")");
		p.print("ListHead---->");
		
		while(n!=null){
			if (n.next==null)
			p.print("(" + n.data+ ", null)\n");
			
			else
				p.print("("+n.data+","+n.next.data+")-->");
			
		n=n.next;		
				
				
		}
		
	}

}
