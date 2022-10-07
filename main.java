package customer;

import java.util.*;

public class main {
	static List<customer> detail=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	static loadCash a12=new loadCash();
	public static void main(String[] args) {
		customerdetails();
		a12.upadate_cash(20, 100, 100);
		int choice;
		do {
			System.out.println("-------------CustomerDetails&AtmProcess-------------");
			System.out.println("1)Load Cash ");
			System.out.println("2)Atm Balance");
			System.out.println("3)Customer ");
			System.out.println("4)operation");
			System.out.println("Enter Choices to do Reqired Operation");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
			    loadcash();
				break;
			case 2:
				displayatmdenomenation();
				break;
			case 3:
				displaydetails();
				break;
	 		case 4:
	 			atmoperation();
	 			break;
	 		case 5:
	 		   break;
	 		 default:
	 			 System.out.println("Enter correct choice");
	 			 
	 			 break;
			}
		}while(choice!=5);
		
	}

   static void atmoperation() {
		operation ob=new operation(); 
	}
	static void loadcash() {
		System.out.println("----------Load to Cash---------");
	    System.out.println("Enter note count->");
	    System.out.println("Enter count_2000");
	    int _2000=sc.nextInt();
	    System.out.println("Enter count_500");
	    int _500=sc.nextInt();
	    System.out.println("Enter count_100");
	    int _100=sc.nextInt();
	    a12.upadate_cash(_2000,_500,_100);
	    displayatmdenomenation();
	}
	static void customerdetails() {
		customer a1=new customer(101,"Abi",2004,25934);
		customer a2=new customer(102,"Arun",2003,44103);
		customer a3=new customer(103,"Aravinth",2002,36100);
		customer a4=new customer(104,"vijay",2001,75000);
		customer a5=new customer(105,"Sundhar",2000,203400);
        detail.addAll(Arrays.asList(a1,a2,a3,a4,a5));
	}
    static void displaydetails() {
    	System.out.println("------------------------Customer Details-----------------------");
		System.out.println("---------------------------------------------------------------");  
		System.out.printf("%8s %20s %12s %16s", "Acc No", "Account Holder", "Pin Number", "Account Balance");  
		System.out.println();  
		System.out.println("---------------------------------------------------------------");   
		for(customer customerdeatail: detail)  
		{  
		System.out.format("%7s %14s %14s %16s",customerdeatail.getAccNo(), customerdeatail.getAhName(), customerdeatail.getsPin(), customerdeatail.getBalance());  
		System.out.println();  
		}  
		System.out.println("----------------------------------------------------------------");
		System.out.print("\n");
	}
    static void displayatmdenomenation() {
    	System.out.println("------------------Atm Balance-------------------");
		System.out.println("---------------------------------------------");  
		System.out.printf("%8s %12s %12s ", "Denomination", "Number", "Value");  
		System.out.println();  
		System.out.println("---------------------------------------------");  
		System.out.format("%7s %16s %12s ","2000", a12.getCount_2000(),a12.getTotal_2000());
		System.out.println();
		System.out.format("%7s %16s %12s ","500", a12.getCount_500(),a12.getTotal_500());  
		System.out.println();
		System.out.format("%7s %16s %12s ","100", a12.getCount_100(),a12.getTotal_100()); 
		System.out.println();
		System.out.println("---------------------------------------------- ");  
		System.out.print("\n");
    }
	
}