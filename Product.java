/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author coope
 */
public class Product implements IDedObject {
    
    private int productID;
    
    private String productName;
    
    private String supplierName;
    
    public Product(int productID, String productName, String supplierName)
    {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    @Override
    public int getID() {
        return productID;
    }

    @Override
    public void printID() {
        System.out.println(productID);
        System.out.println(productName);
        System.out.println(supplierName);
    }
    
}
