
import java.sql.*;
import java.util.Scanner;
public class book{
public void readbook() throws Exception

{
    Connection con=DBconnections.getConnections();
    String qurey ="select * from book ";
    try{
        
        PreparedStatement smt=con.prepareStatement(qurey);
        ResultSet rs=smt.executeQuery(qurey);
        System.out.println("+---------------+---------+------------+-------------+");
        System.out.println("| book_name     | book_id | author_name| quantity    |");
        System.out.println("+---------------+---------+------------+-------------+");
        
        while(rs.next())
        {
            String book_name=rs.getString("book_name");
            int book_id=rs.getInt("book_id");
            String author_name=rs.getString("author_name");
            int quantity=rs.getInt("quantity");
            System.out.printf("|%-15s|%-9s|%-12s|%-12s |\n",book_name,book_id,author_name,quantity);
                System.out.println("+---------------+---------+------------+-------------+");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    Scanner sc=new Scanner(System.in);
    public void  insertbook() throws SQLException, ClassNotFoundException
    {
        Connection con=DBconnections.getConnections();
        
        
        System.out.println("Enter the book name:");
        String book_name=sc.next();
        System.out.println("Enter the book id:");
        int book_id=sc.nextInt();
        System.out.println("Enter the author name:");
        String author_name=sc.next();
        System.out.println("Enter the quantity:");
        int quantity=sc.nextInt();
        
        String querey="insert into book values(?,?,?,?)";
        
        
        PreparedStatement pst= con.prepareStatement(querey);
        pst.setString(1,book_name);
        pst.setInt(2,book_id);
        pst.setString(3,author_name);
        pst.setInt(4,quantity);
        
        int rp=pst.executeUpdate();
        if(rp>0)
        System.out.println("book added successfully!!!"); 
        else
        System.out.print("failed to add book...");
       // sc.close(); 
        
    }
    public int delbook(bookdetails books) throws SQLException,ClassNotFoundException
    {
        Connection con=DBconnections.getConnections();
        String query ="delete from book where book_name = ?";
        PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1,books.getBook_name());
        int n=pst.executeUpdate();
        return n;
    }
    public void borrowBook() throws SQLException, ClassNotFoundException {
        Connection con = DBconnections.getConnections();
         //Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.next();
        System.out.println("Enter the user_id");
        int id=sc.nextInt();
        
        String query = "update book SET quantity = quantity - 1 WHERE book_name = ? AND quantity > 0";
        
        PreparedStatement change = con.prepareStatement(query);
        change.setString(1, title);
        int rowsUpdated = change.executeUpdate();
        
        if (rowsUpdated > 0) {
            System.out.println("Book borrowed successfully");
        }
         else
          {
        System.out.println("Failed to borrow book");
    }

    String q="insert into borrow values(?,?)";
    PreparedStatement pst=con.prepareStatement(q);
    pst.setInt(1,id); 
    pst.setString(2,title);
    int rs=pst.executeUpdate();
    if(rs>0)
    {
        System.out.println("borrow details insert successfully..");
    }
    else{
        System.out.println("failed to insert.....");
    }
     
    String q1="select * from  borrow";
    Statement smt=con.createStatement();
    System.out.println("+---------+-----------+");
    System.out.println("| user_id | book_name |");
    System.out.println("+---------+-----------+");
    ResultSet r=smt.executeQuery(q1);
    while(r.next())
    {
        int user_id=r.getInt("user_id");
        String book_name=r.getString("book_name");
        System.out.printf("|%-9s|%-11s|\n",user_id,book_name);
        System.out.println("+---------+-----------+");

    }
   //sc.close();
}
public void readborrow() throws Exception
    {
        Connection con=DBconnections.getConnections();
        String q1="select * from  borrow";
    Statement smt=con.createStatement();
    System.out.println("+---------+-----------+");
    System.out.println("| user_id | book_name |");
    System.out.println("+---------+-----------+");
    ResultSet r=smt.executeQuery(q1);
    while(r.next())
    {
        int user_id=r.getInt("user_id");
        String book_name=r.getString("book_name");
        System.out.printf("|%-9s|%-11s|\n",user_id,book_name);
        System.out.println("+---------+-----------+");

    }
            
    }

public  int returnBook(bookdetails books) throws SQLException,ClassNotFoundException {
    Connection con=DBconnections.getConnections();
  //  Scanner sc = new Scanner(System.in);
   //System.out.print("Enter book title: ");
   // String title = sc.nextLine();
    
  
String query = "update book set quantity = quantity + 1 where book_name = ?";

PreparedStatement change = con.prepareStatement(query);
change.setString(1,books.getBook_name());
int rowsUpdated = change.executeUpdate();

if (rowsUpdated > 0) {
    System.out.println("Book returned successfully");
} else {
    System.out.println("Failed to return book");
}

String q1="delete from borrow where book_name = ?";
PreparedStatement pst=con.prepareStatement(q1);
pst.setString(1,books.getBook_name());
int n=pst.executeUpdate();
return n;
//sc.close();

}
}
