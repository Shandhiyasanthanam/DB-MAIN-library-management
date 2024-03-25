import java.sql.*;
import java.util.Scanner;
//import java.time.LocalDate;
public class user
{
    Scanner sc=new Scanner(System.in);
    public void readuser() throws Exception
    {
    Connection con=DBconnections.getConnections();
    String qurey ="select * from user ";
    try{

        PreparedStatement smt=con.prepareStatement(qurey);
        ResultSet rs=smt.executeQuery(qurey);
        System.out.println("+----------+------+----------+--------------------+--------------------+");
        System.out.println("|  u_name  | u_id |  u_city  |      u_mobno       |     u_mail         |");
        System.out.println("+----------+------+----------+--------------------+--------------------+");
        
        while(rs.next())
        {
            String name=rs.getString("u_name");
            int id=rs.getInt("u_id");
            String city=rs.getString("u_city");
            String mobno=rs.getString("u_mobno");
            String mail=rs.getString("u_mail");
            System.out.printf("|%-10s|%-6s|%-10s|%-20s|%-20s|\n",name,id,city,mobno,mail);
            System.out.println("+----------+------+----------+--------------------+--------------------+");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
}

 public void  userinsert() throws SQLException, ClassNotFoundException
    {
        Connection con=DBconnections.getConnections();
       
        
        System.out.println("enter the user name:");
        String u_name=sc.next();
        System.out.println("enter the user id");
        int u_id=sc.nextInt();
        System.out.println("enter the user city:");
        String u_city=sc.next();
        System.out.println("enter the user mobile number: ");
        String u_mobno=sc.next();
        System.out.println("enter the user mail");
        String u_mail=sc.next();
        
        String querey="insert into user values(?,?,?,?,?)";
        
        
        PreparedStatement pst= con.prepareStatement(querey);
        pst.setString(1,u_name);
        pst.setInt(2,u_id);
        pst.setString(3,u_city);
        pst.setString(4,u_mobno);
        pst.setString(5,u_mail);
        
        int rp=pst.executeUpdate();
        if(rp>0)
        System.out.println("User added successfully!!!"); 
        else
        System.out.print("failed to add user...");
        //sc.close(); 
        
    }  
    
    public int deluser(userdetails user) throws SQLException,ClassNotFoundException
  {
      Connection con=DBconnections.getConnections();
      String query ="delete from user where u_name = ?";
      PreparedStatement pst=con.prepareStatement(query);
      pst.setString(1,user.getU_name());
      int n=pst.executeUpdate();
      return n;
}
}

    