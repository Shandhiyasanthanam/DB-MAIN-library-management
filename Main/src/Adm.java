import java.sql.*;

public class Adm
{
    public void read() throws Exception
    {
        Connection con=DBconnections.getConnections();
        String qurey ="select * from Adm ";
        Statement smt=con.createStatement();
        System.out.println("+--------+----------+-----------------+");
        System.out.println("| Adm_id | Adm_name | Adm_mail        |");
        System.out.println("+--------+----------+-----------------+");
        ResultSet rs=smt.executeQuery(qurey);
        while(rs.next())
        {
            int Adm_id=rs.getInt("Adm_id");
            String Adm_name=rs.getString("Adm_name");
            String Adm_mail=rs.getString("Adm_mail");
            System.out.printf("|%-8s|%-10s|%-17s|\n",Adm_id,Adm_name,Adm_mail);
            System.out.println("+--------+----------+-----------------+");
            
            
    }
}

}