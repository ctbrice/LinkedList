/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author coope
 * @param <AnyType>
 */
public class LinkedList<AnyType extends IDedObject> {
    
    private Node head;
    
    public LinkedList()
    {
        head = null;
    }

    //empties linked list
    public void makeEmpty()
    {
        head = null;
    }
    
    // Get the  generic type to get the particular id and returns AnyType.
    // Don’t remove the object from the list. 
    // Returns null if the list is empty or ID not found.  
    public AnyType findID(int ID)
    {
        Node currentNode = head;
        while(currentNode != null)
        {
            if(currentNode.getData().getID() == ID)
            {
                return (AnyType) currentNode.getData();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
    // insert at front of list
    // return false if that ID already exists 
    public boolean insertAtFront(AnyType x)
    {
        if(findID(x.getID()) != null)
        {
            return false;
        }
        Node newNode = new Node(x);
        newNode.setNext(head);
        head = newNode;
        return true;
    }
    // delete and return the record at the front of  the list
    // return null if the list is empty 
    public AnyType deleteFromFront()
    {
        if(head == null)
            return null;
        Node oldHead = head;
        head = head.getNext();
        return (AnyType) oldHead.getData();
    }
    // find and delete the record with the given ID
    // returns null if it isn’t found 
    public AnyType delete(int ID)
    {
        if(head == null)
        {
            return null;
        }
        if(head.getData().getID() == ID)
        {
            return deleteFromFront();
        }
        Node currentNode = head;
        while(currentNode.getNext() != null)
        {
            if(currentNode.getNext().getData().getID() == ID)
            {
                AnyType deletedData = (AnyType) currentNode.getNext().getData();
                currentNode.setNext(currentNode.getNext().getNext());
                return deletedData;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
    
    // print all elements in the order they appear in the linked list
    // if list is empty print appropriate message. 
    public void printAllRecords()
    {
        if(head == null)
            System.out.println("List is empty.");
        Node currentNode = head;
        while(currentNode != null)
        {
            currentNode.getData().printID();
            currentNode = currentNode.getNext();
        }
    }    
}
