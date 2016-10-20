/**
 * @author mohammedraian
 * cuny id - 23140824
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class project1 {
	public static void main(String [] args){
		LinkedList LinkedList = new LinkedList("dummy");
		ListNode node;
		Scanner s; 
		
		try{
			s= new Scanner(new FileReader(args[0]));
			PrintWriter p = new PrintWriter(new FileWriter(args[1]));
			while(s.hasNext()){
				String str = s.next();
				
			node= LinkedList.findSpot(str);
			
			ListNode newNode = new ListNode(str);
			
			LinkedList.ListInsert(node,newNode);
			
			LinkedList.printList(p,str);
			}
		p.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
