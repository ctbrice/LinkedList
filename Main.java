/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author coope
 */
public class Main {
    
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList<Product>();
        Scanner scanner = new Scanner(System.in);
        Boolean notDone = true;
        while(notDone)
        {
            System.out.print("Operations on List\n"
                    + "1. Make Empty\n"
                    + "2. Find ID\n"
                    + "3. Insert At Front\n"
                    + "4. Delete From Front\n"
                    + "5. Delete ID\n"
                    + "6. Print All Records\n"
                    + "7. Done\n"
                    + "Your choice: ");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1: // This option empties the linked list
                    linkedList.makeEmpty();
                    System.out.println("List has been emptied.");
                    break;
                case 2: // prints all details of product ID. 
                    System.out.print("ID No: ");
                    int findID = scanner.nextInt();
                    if(linkedList.findID(findID) == null)
                    {
                        System.out.println("ID not found."); // if ID not in list, prints message
                    }
                    else
                    {
                        linkedList.findID(findID).printID();
                    }
                    break;
                case 3: // get the product details from the user and adds it to the front of the list
                    System.out.print("Enter Product ID: ");
                    int newProductID = scanner.nextInt();
                    System.out.print("Enter Product Name: ");
                    scanner.nextLine();
                    String productName = scanner.nextLine();
                    System.out.print("Enter Supplier Name: ");
                    String supplierName = scanner.nextLine();
                    Product newProduct = new Product(newProductID, productName, supplierName);
                    System.out.println("...");
                    if(linkedList.insertAtFront(newProduct))
                    {
                        System.out.println("Product added.");
                    }
                    else
                    {
                        System.out.println("Product not added.");
                        System.out.println("A product with that ID already exists in the list.");
                    }
                    break;

                case 4: // print the first item on the list and then delete it
                    IDedObject deletedNode = linkedList.deleteFromFront();
                    if(deletedNode == null)
                    {
                        System.out.println("List is empty.");
                    }
                    else
                    {
                        deletedNode.printID();
                        System.out.println("First item deleted.");
                    }
                    break;
                case 5: // print particular IDed item and then delete it
                    System.out.print("Enter Product ID: ");
                    int productID = scanner.nextInt();
                    IDedObject deletedID = linkedList.delete(productID);
                    if(deletedID == null)
                    {
                        System.out.println("Product not found.");
                    }
                    else
                    {
                        deletedID.printID();
                        System.out.println("...");
                        System.out.println("Product deleted.");
                    }
                    break;
                case 6: // print all records in the list
                    linkedList.printAllRecords();
                    break;
                case 7: // quit the program
                    notDone = false;
                    System.out.println("Done.");
                    break;
                default: // if number given is not between 1-7, print message
                    System.out.println("Input invalid, please try again.");
            }
        }
    }
    
}
