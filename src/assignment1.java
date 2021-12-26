
import java.io.*;
import java.util.Scanner;
public class assignment1{
	

	public static void main(String[] args) {
		int y =1;
		do {
		Scanner sc= new Scanner(System.in); 
		System.out.println("welcome to application");
		System.out.println("select below option \n1. create new directory \n2.enter name for pre-existing directory and perform operation"); 
		int op= sc.nextInt();
		
		switch(op){    
	    case 1: 
	    	System.out.println("Enter the path where you want to create a folder: ");  
	        Scanner sc1 = new Scanner(System.in);  
	        String path = sc1.next();  
	        System.out.println("Enter the name of the desired a directory:");  
	        path=path+"\\";
	        path = path+sc1.next();  
	        System.out.println(path);
	        File f1 = new File(path);  
	        boolean bool = f1.mkdir();  
	        if(bool){  
	           System.out.println("Folder is created successfully");  
	        }else{  
	           System.out.println("Error Found!");  
	        }  
	    break;    
	   case 2:
		   int z=1;
		   do {
	    	System.out.println("1.retrive all file \n2.perform actions on file");
	    	Scanner sc3=new Scanner(System.in);
	    	int ob=sc3.nextInt();
	    	switch(ob) {
	    	case 1:
	    		System.out.println("Enter the path of folder to display list of file in it: ");  
		        Scanner sc5 = new Scanner(System.in);  
		        String p = sc5.next();  
		        File f2 = new File(p); 
		        File array[]=f2.listFiles();
		        for(int i=0;i<array.length;i++) {
		        	System.out.println(array[i]);
		        }
	    		break;
	    	case 2:
	    		int u=1;
	    		do {
	    		System.out.println("1.add file \n2.delete file/folder \n3.display file my inital name");
	    		Scanner sc4=new Scanner(System.in);
	    		int co=sc4.nextInt();
	    		if(co==1) {
	    			System.out.println("Enter the path of folder to add a file in it: ");  
			        Scanner sc6 = new Scanner(System.in);  
			        String p1 = sc6.next();  
			        System.out.println("Enter the name of the desired file to add:");  
			        p1=p1+"\\";//this code is use to put additional slash bar to add new file
			        p1 = p1+sc6.next();  
			        File f3 = new File(p1);
			    
			        try
			        {  
			        	f3.createNewFile();  //creates a new file  
			      
			        	}   
			        	catch (Exception e)   
			        	{ 
			        		System.out.println(e.getMessage());
			        	}
			        	}     
	    		
	    		else if(co==2) {
	    			System.out.println("Enter the path of folder to delete a file in it: ");  
			        Scanner sc7 = new Scanner(System.in);  
			        String p2 = sc7.next();  
			        System.out.println("Enter the name of file to delete it:");  
			        p2=p2+"\\";
			        p2 = p2+sc7.next();  
			        //System.out.println(p2);
			        File f4 = new File(p2);
			      
			        try
			        {  
			        	 f4.delete(); 
			      
			        	}   
			        	catch (Exception m)   
			        	{ System.out.println(m.getMessage()) ;
			        	}         
	    			
	    			}
	    		else if(co==3) {
	    			System.out.println("Enter the path of folder to search a file in it: ");  
			        Scanner sc8 = new Scanner(System.in);  
			        String p3= sc8.next();  
			         File f5 = new File(p3); 
		        	File array1[]=f5.listFiles();
			        System.out.println("Enter the name of file to search");  
			        Scanner sc9= new Scanner(System.in);
			        String name1=sc9.next();  
			        for(int j=0;j<array1.length;j++) {
			        if(array1[j].getName().startsWith(name1))
			        {
		        	System.out.println(array1[j]);}
			        	}  
	    			}
	    		else {
	    			System.out.println("wrong input");
	    		}
	    		System.out.println("press 1 to continue and 0 to exit");
			    Scanner sc12=new Scanner(System.in);
			    y=sc12.nextInt();
	    	}while(u!=0);
	    		break;
	    	
	    	default :System.out.println("Invalid input");	
	    	break;	
	    	}System.out.println("press 1 to continue and 0 to exit");
		    Scanner sc11=new Scanner(System.in);
		    y=sc11.nextInt();
		}while(z!=0);
	    break;    
	    default:System.out.println("Invalid input");
	    break;
	    }
		System.out.println("press 1 to continue and 0 to exit");
	    Scanner sc10=new Scanner(System.in);
	    y=sc10.nextInt();
		}while(y!=0) ;
		

}
}