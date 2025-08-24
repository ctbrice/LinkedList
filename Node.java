/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author coope
 */
public class Node<AnyType extends IDedObject> {
    
    private AnyType data;
    private Node next;
    
    public Node()
    {
        data = null;
        next = null;
    }
    
    public Node(AnyType data)
    {
        this.data = data;
        next = null;
    }
    
    public void setNext(Node next)
    {
        this.next = next;
    }
    public Node getNext()
    {
        return next;
    }
    
    public AnyType getData()
    {
        return data;
    }
    
}
