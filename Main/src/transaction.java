import java.sql.*;
import java.util.Scanner;
public class transaction {
    Scanner sc=new Scanner(System.in);
    public void  readtransaction() throws SQLException, ClassNotFoundException
    {
        Connection con=DBconnections.getConnections();
        String querey="(select * from transactions)";
        Statement smt=con.createStatement();
        System.out.println("+----------------+---------+-------+-------------+------------+-------------+");
        System.out.println("| transaction_id | user_id | bk_id | borrow_date | due_date   | return_date |");
        System.out.println("+----------------+---------+-------+-------------+------------+-------------+");
        
        ResultSet rp=smt.executeQuery(querey);
        while(rp.next())
        {
            int transaction_id=rp.getInt("transaction_id");
            int user_id=rp.getInt("user_id");
            int bk_id=rp.getInt("bk_id");
            String bordate=rp.getString("borrow_date");
            String duedate=rp.getString("due_date");
            String retdate=rp.getString("return_date");
            System.out.printf("|%-16s|%-9s|%-7s|%-13s|%-12s|%-13s|\n",transaction_id, user_id,bk_id,bordate,duedate,retdate);
            System.out.println("+----------------+---------+-------+-------------+------------+-------------+");
        }
}
    
    
    public void insertTransaction() throws SQLException,ClassNotFoundException
    {
        Connection con=DBconnections.getConnections();
        System.out.println("enter the userid:");
        int userId=sc.nextInt();
        System.out.println("enter the bookid:");
        int bk_id=sc.nextInt();
        System.out.println("enter the borrowdate:");
        String borrowDate=sc.next();
        System.out.println("enter the duedate:");
        String dueDate=sc.next();
        System.out.println("enter the returndate:");
        String returnDate=sc.next();
        
            String sql = "INSERT INTO Transactions (user_id, bk_id, borrow_date, due_date, return_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setInt(1, userId);
            pst.setInt(2, bk_id);
            pst.setString(3, borrowDate);
            pst.setString(4, dueDate);
            pst.setString(5, returnDate); 
            
            int rp=pst.executeUpdate();
            if(rp>0)
            {

                System.out.println("Transaction inserted successfully.");
            }
            
            else
            {

                System.out.print("failed to add ...");
            }
            //sc.close(); 
    } 
  
}
