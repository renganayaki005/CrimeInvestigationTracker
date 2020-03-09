/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RengaNayagi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Login {
    public String validateUser(String Id, String pwd)
    {
       try{
   Class.forName("oracle.jdbc.driver.OracleDriver");     
   Connection con=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","renga");
   PreparedStatement pstmt=con.prepareCall("select * from Login where Id= ?");
   pstmt.setString(1,Id );
   ResultSet rs=pstmt.executeQuery();
   if(rs.next()){
       if((rs.getString("usertype").equals("Admin"))){
           pstmt=con.prepareCall("select * from admin where AdminId= ?");
           pstmt.setString(1,Id );
           rs=pstmt.executeQuery();
           if(rs.next()){
      if(pwd.equals(rs.getString("password")))
      {
          return "Admin Login Succesfull";
        }
      else{
           //invalid password
          return "Invalid password";
       }
      }
          
       }
       else if(rs.getString("usertype").equals("InvestigationOfficer")){
           pstmt=con.prepareCall("select * from InvestigationOfficer where officerId= ? ");
           pstmt.setString(1, Id);
           rs=pstmt.executeQuery();
           if(rs.next()){
           if(pwd.equals(rs.getString("password")))
      {
          return "Investigation Officer Login Successfull";
        }
      else{
           //invalid password
          return "Invalid password";
       }
           }   
       }
       else if(rs.getString("usertype").equals("ForensicOfficer")){
           pstmt=con.prepareCall("select * from ForensicOfficer where officerId= ? ");
           pstmt.setString(1, Id);      
           rs=pstmt.executeQuery();
           if(rs.next())
           {
           if(pwd.equals(rs.getString("password")))
      {
          return "Forensic Officer Login Successfull";

        }
      else{
           //invalid password
          return "Invalid password";
       }
           }
           
       }
   }
   else
   {
       //no such Id exists in userlogin
          return "Invalid user id";
   }
   }catch(Exception e)
   {
       System.out.println(e);
   }
       return "";
}
}
