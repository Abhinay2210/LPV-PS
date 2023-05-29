import java.util.*;

public class TokenRing{

	public static void main(String[] args){
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of nodes you wanted in ring: ");
		int n = sc.nextInt();
		
		System.out.println("Formed Token Ring: ");
		
		for(int i=0;i<n;i++){
		
			System.out.print(i + " ");
		}
		
		System.out.println("0");
		
		int choice = 0;
		
		do{
		
			System.out.print("Enter Sender: ");
			int sender = sc.nextInt(); 
			
			System.out.print("Enter Receiver: ");
			int receiver = sc.nextInt();
			
			System.out.print("Enter data: ");
			int data = sc.nextInt();
			
			int token = 0;
			
			System.out.print("Token Passing: ");
			for(int i=token;i<sender;i++){
			
			System.out.print(" "+ i +"->");
			
			}
			
			System.out.println(" "+ sender);
			
			System.out.println("Sender: "+ sender + " Data: " + data);
			
			for(int i=sender; i!=receiver; i=(i+1)%n){
			
			System.out.println("Data: "+ data + " is forwarded by " + i);
			
			}
			System.out.println("Data: "+ data + " is received by " + receiver);
			
			token = sender;
			
			System.out.println("Continue: 1, exit: 0");
			choice = sc.nextInt();
			
		}while(choice == 1);
		
		
	}
}
