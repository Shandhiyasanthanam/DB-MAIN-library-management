import java.sql.*;
import java.util.Scanner;

public class employee {
    Scanner sc=new Scanner(System.in);
    public void  addemp() throws SQLException, ClassNotFoundException
{
    Connection con=DBconnections.getConnections();
    
    System.out.println("enter the staff_name");
    String staff_name=sc.next();
    System.out.println("enter the staff_id");
    int staff_id=sc.nextInt();  
    
    
    String querey="insert into emp values(?,?)";
    
    
    PreparedStatement pst= con.prepareStatement(querey);
    pst.setString(1,staff_name);
    pst.setInt(2,staff_id);
    
    int rp=pst.executeUpdate();
    if(rp>0)
    System.out.println("employee added successfully!!!"); 
    else
    System.out.println("failed to add ...");
   
    
}
public void reademp() throws SQLException,ClassNotFoundException
{
    Connection con=DBconnections.getConnections();
    String qurey ="select * from emp ";
    Statement smt=con.createStatement();
    ResultSet rs=smt.executeQuery(qurey);
    System.out.println("+------------+----------+");
    System.out.println("| staff_name | staff_id |");
    System.out.println("+------------+----------+");
    while(rs.next())
    {
        String staff_name=rs.getString("staff_name");
        int staff_id=rs.getInt("staff_id");
        System.out.printf("|%-12s|%-10s|\n",staff_name,staff_id);
        System.out.println("+------------+----------+");
        
        
        }
       
    }  
    public int delemp(employeedetails emp1) throws SQLException,ClassNotFoundException
    {
        Connection con=DBconnections.getConnections();
        String query ="delete from emp where staff_id = ?";
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1,emp1.getStaff_id());
        int n=pst.executeUpdate();
        return n;
  }   
}
