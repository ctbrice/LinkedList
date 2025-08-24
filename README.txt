Created by Cooper Brice ctb220006 using Apache NetBeans IDE 25

To run, create a new project in Apache NetBeans. Select Java with Ant and Java Application. Extract the zip file into the src file of new project. Now you can either push the run project button or right click on the Main.java file and select run file to run the program.

The program will prompt the user to choose 1 of 7 choices:
1 - Make empty (empties the list)
2 - Find ID (prompts user for an ID and prints all details of product with ID)
3 - Insert At Front (prompts user for ID, product name, and supplier name, and then inserts product at front if the ID does not already exist in the list)
4 - Delete From Front (prints and deletes the first element in the list)
5 - Delete ID (prompts the user for an ID, prints and deletes product with ID)
6 - Print All Records (prints all products in list)
7 - Done (quits the program)

When making choices, the program accepts any integer number and will run the choice of the respective number. Any other input will cause an error.

When prompted for ID, the program accepts any integer number. Any other input will cause an error.

For the product and supplier name, any input is accepted.

Sample run:

Operations on List
1. Make Empty
2. Find ID
3. Insert At Front
4. Delete From Front
5. Delete ID
6. Print All Records
7. Done
Your choice: 3
Enter Product ID: 883
Enter Product Name: Temoc
Enter Supplier Name: UTD
...
Product added.
Operations on List
1. Make Empty
2. Find ID
3. Insert At Front
4. Delete From Front
5. Delete ID
6. Print All Records
7. Done
Your choice: 3
Enter Product ID: 123
Enter Product Name: Presents
Enter Supplier Name: Santa
...
Product added.
Operations on List
1. Make Empty
2. Find ID
3. Insert At Front
4. Delete From Front
5. Delete ID
6. Print All Records
7. Done
Your choice: 2
ID No: 883
883
Temoc
UTD
Operations on List
1. Make Empty
2. Find ID
3. Insert At Front
4. Delete From Front
5. Delete ID
6. Print All Records
7. Done
Your choice: 5
Enter Product ID: 123
123
Presents
Santa
...
Product deleted.
Operations on List
1. Make Empty
2. Find ID
3. Insert At Front
4. Delete From Front
5. Delete ID
6. Print All Records
7. Done
Your choice: 6
883
Temoc
UTD
Operations on List
1. Make Empty
2. Find ID
3. Insert At Front
4. Delete From Front
5. Delete ID
6. Print All Records
7. Done
Your choice: 7