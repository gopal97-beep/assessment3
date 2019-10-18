package assessment3;
import java.util.*;



public class store {

	public store()  {
		// TODO Auto-generated constructor stub
	}
    List<item> items=new ArrayList<>();
    List<item> inv=new ArrayList<>();
    static boolean flag=true;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		store s=new store();
		try {
		s.display();
		}
		catch (invalidexception ie) {
			System.err.println(ie.getMessage());
			do {
				try{s.display();}catch(Exception i) {
					
				}}while(flag);
		}
		
		

	}
	public void display() throws invalidexception {
		int exit=0;
		do {
		System.out.println("Welcome to the Store");
		System.out.println("-----Menu--------");
		System.out.println("1.Stock options");
		System.out.println("2.Sales options");
		System.out.println("3.Exit");
		int option;
		Scanner sc=new Scanner(System.in);
		option=sc.nextInt();
		switch(option) {
		case 1: stock();
		        break;
		case 2:  sales();
		  break;
		case 3:   exit=-1;
		break;
		default:System.out.println("Enter valid option");
		break;
		
		}
		}while(exit!=-1);
		
		
		
	}
	public void stock()  throws  invalidexception{
		 int e=0;
		 
		 do { 
			 System.out.println("Welcome to stocks department");
			 System.out.println("1.Add item details");
			 System.out.println("2.update item details");
			 System.out.println("3.Display item details");
			 
			 System.out.println("4.Exit");
			 Scanner sc=new Scanner(System.in);
			 int opt=sc.nextInt();
			 switch(opt){
			 case 1:System.out.println("Enter item code");
			        int codei=sc.nextInt();
			        int str3 = String.valueOf(codei).length();
			        
			       
			        	if(str3<3||str3>3) {
			        		throw new invalidexception("code must be of 3 digits");
			        	}
			       
			        String namei = null;
			        System.out.println("Enter item name");
			        
			        namei=sc.next();
			        char[] c= namei.toCharArray();
			        
			        for(char v:c) {
			        if(Character.isDigit(v)) {
			        	throw new invalidexception("Name cannot conatin integer values");
			        	}
			        }
			        
			        
			       
			        
			        System.out.println("Eneter price");
			        double pricei=sc.nextDouble();
			        System.out.println("Eneter Quantity");
			        int quant=sc.nextInt();
			        item i=new item(codei,namei,pricei,quant);
			        items.add(i);
			        break;
			 case 2: System.out.println("THE CURRENT INVENTORY");
			 System.out.println();
			 
			 
				System.out.println("-----------------------------------------------------------------------------");
		    	System.out.printf("%10s %15s %15s %15s", "CODE","NAME", "PRICE","QUANTITY");
		    	System.out.println();
		    	System.out.println("-----------------------------------------------------------------------------");
		    	
		    	for( item i1:items ) {
		    		
		    		System.out.printf("%10s %15s %15s %15s ",i1.code,i1.name,i1.price,i1.quantity);
		    		System.out.println();
		    	}
		    	System.out.println("-----------------------------------------------------------------------------");
		    	System.out.println();
		    	System.out.println("Enter the code to update the details");
		    	int coder=sc.nextInt();
		    	int index1=0;
		    	boolean fl=false;
		    	 for(int j=0;j<items.size();j++) {
		    	if(coder==items.get(j).code) {
				    index1=j;
				    fl=true;
		    	}
		    	else if(!fl){
		    		System.out.println("Enter valid code");
		    	}
		    	 }
		    	if(fl) {
		    		
		    		 System.out.println("Enter item name");
				        String namej=sc.next();
				        System.out.println("Eneter price");
				        double pricej=sc.nextDouble();
				        System.out.println("Eneter Quantity");
				        int quani=sc.nextInt();
				        item y=new item(coder,namej,pricej,quani);
				        items.remove(index1);
				        items.add(index1,y);
		    		
		    		
		    	}
		     
		    	break;
		    	
			 case 3: System.out.println("OUR CURRENT INVENTORY");
			 System.out.println();
			 
			 
				System.out.println("-----------------------------------------------------------------------------");
		    	System.out.printf("%10s %15s %15s %15s", "CODE","NAME", "PRICE","QUANTITY");
		    	System.out.println();
		    	System.out.println("-----------------------------------------------------------------------------");
		    	
		    	for( item i1:items ) {
		    		
		    		System.out.printf("%10s %15s %15s %15s",i1.code,i1.name,i1.price,i1.quantity);
		    		System.out.println();
		    	}
		    	System.out.println("-----------------------------------------------------------------------------");
	   System.out.println();
	   break;
		    	
			 case 4: e=-1;
			         break;
			 default:System.out.println("Enter valid option");
				break;
			        
			        
				 
			 }
				
			 
		 }
		 while(e!=-1);
		
		
	}
	public void sales() {
		int o=0;
		do {
		
			 System.out.println("Welcome to sales department");
			 System.out.println("OUR CURRENT INVENTORY");
			 System.out.println();
			 
			 
				System.out.println("-----------------------------------------------------------------------------");
		    	System.out.printf("%10s %15s %15s %15s", "CODE","NAME", "PRICE","QUANTITY" );
		    	System.out.println();
		    	System.out.println("-----------------------------------------------------------------------------");
		    	
		    	for( item i1:items ) {
		    		
		    		System.out.printf("%10s %15s %15s %15s ",i1.code,i1.name,i1.price,i1.quantity);
		    		System.out.println();
		    	}
		    	System.out.println("-----------------------------------------------------------------------------");
	   System.out.println();
	   System.out.println("1.Eneter the item details");
	   System.out.println("2.Display invoice");
	   System.out.println("3.exit");
	   
	   Scanner sc=new Scanner(System.in);
	   double total;
	   int codem;
	   
	   int opt1=sc.nextInt();
	   switch(opt1){
		   case 1: System.out.println("Eneter the item code");
		    int codep=sc.nextInt();
		   System.out.println("Eneter the item quantity");
		   int quantp=sc.nextInt();
		   int index=0;
		   String nam;
		   boolean flag=false;
		   int quanr=0;
		   for(int i=0;i<items.size();i++) {
		   if(codep==items.get(i).code) {
			    index=i;
			    codem=index;
			    flag=true;
			    if(quantp<=items.get(i).quantity) {
			    flag=true;
			    
			    
				   
				   
			    
			    }
		   }
			    else {
			    	flag=false;
			    	System.out.println("The code is invalid");
			    	break;
			    
			    	
			    	
			    	
			    
		   
	   }
		   }
		   if(flag) {
			   
			   total=quantp*items.get(index).price;
			   nam=items.get(index).name;
			   quantp=items.get(index).quantity-quantp;
			   items.get(index).rem=quanr;
			   inv.add(index,new item(codep,nam,total,quantp));
			   
			   
		   }
		   else {System.out.println("The quantity is excedded");
			   
		   }
		   
		   
		   
		   break;
		   case 2: System.out.println("Your invoice");
		     
		   System.out.println("-----------------------------------------------------------------------------");
	    	System.out.printf("%10s %15s %15s %15s", "CODE","NAME", "TOTAL","Remaining qty");
	    	System.out.println();
	    	System.out.println("-----------------------------------------------------------------------------");
	    	double bill = 0;
	    	for( item i2:inv ) {
	    		
	    		System.out.printf("%10s %15s %15s %15s",i2.code,i2.name,i2.price,i2.quantity);
	    		System.out.println();
	    		bill+=i2.price;
	    		
	    		
	    		
	    	}
	    	System.out.println("-----------------------------------------------------------------------------");
	    	System.out.println("Total bill="+bill);
	    	System.out.println("-----------------------------------------------------------------------------");
	    	
	    	
		      break;     
		   case 3: o=-1;break;
		   default:System.out.println("Enter valid option");
			break;
		   
			   
		   }
		}
		while(o!=-1);
		
		 
		
	}

}
