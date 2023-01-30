package lockMe.client;
import java.io.*;
import java.util.*;
import lockMe.model.operations.BusinessLevelOperations;


public class MainApp {
	public static void main(String[] args) {
		homeScreen();
		try {
			menu();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static void homeScreen() {
		System.out.println("Application Name: LockedMe.com");
		System.out.println("Developer Details: Developed by Elinath-rose Ndekimo");
		System.out.println("Dated: Jan 2023 \n");	
	}
	
	public static void menu() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		BusinessLevelOperations obj = new BusinessLevelOperations();
		int choice;
		
		do {
		System.out.println("Enter your choice from below menu:");
		System.out.println("\t1. Retrieve filenames in ascending order.");
		System.out.println("\t2. Business-level operations.");
		System.out.println("\t3. Exit application. \n");
		
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			obj.showFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Select an operation to perform");
			System.out.println("\t1. Add file.");
			System.out.println("\t2. Delete File");
			System.out.println("\t3. Search for a file");
			System.out.println("\t4. Exit menu");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exited from Business-level operations");
				System.out.println("=========================================\n");
				break;
			default:
				System.out.println("You have entered an invalid Choice");
				System.out.println("==================================\n");
				
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting the application");
			System.out.println("=======================\n");
			break;
		default:
			System.out.println("You have entered an invalid Choice");
			System.out.println("==================================\n");
		}
		
		}while(choice!=3);
		
	}
	

}
