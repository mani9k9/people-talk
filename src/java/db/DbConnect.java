
package db;

import java.io.*;
import java.sql.*;
import java.util.*;
public class DbConnect {
    private Connection c;
    private Statement st;
    private PreparedStatement updatePassword,changePassword,editProfile,getFile,getPassword,getMessage,checkLogin,insertUser,getPhoto,searchPeople,getPeopleByEmail,sendMessage;
    
    public DbConnect()throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ptalk","root","root");
    st=c.createStatement();
    checkLogin=c.prepareStatement("Select * from userinfo where email=? and pass=? ");
    insertUser=c.prepareStatement("insert into userinfo values(?,?,?,?,?,?,?,?,?,?)");
    getPhoto=c.prepareStatement("select photo from userinfo where email=?");
    searchPeople=c.prepareStatement("select name,email,phone,dob,gender from userinfo where state=? and city=? and email!=? and area like ?");
    getPeopleByEmail=c.prepareStatement("Select * from userinfo where email=?");
   sendMessage=c.prepareStatement("insert into peoplemsg (sid,rid,message,filename,ufile,udate) values (?,?,?,?,?,now())");
    getMessage=c.prepareStatement("select * from peoplemsg where sid=? and rid=?");
    getPassword=c.prepareStatement("select pass from userinfo where email=?");
    getFile=c.prepareStatement("select ufile from peoplemsg where pid=?");
    editProfile=c.prepareStatement("update userinfo set name=?, phone=?,gender=?,dob=?,state=?,city=?,area=? where email=?");
   // changePassword=c.prepareStatement("select pass from userinfo where email=? ");
    updatePassword=c.prepareStatement("update userinfo set pass=? where email=? and pass=?");
    }
    
    
    
    public String changePassword(String e,String o,String n,String c) throws SQLException{
   
    //ResultSet rs=changePassword.executeQuery();
   
    {
       if(n.equals(c)){
       updatePassword.setString(1,n);
        updatePassword.setString(2,e);
         updatePassword.setString(3,o);
       int x=updatePassword.executeUpdate();
       if(x!=0){
       return "done";
       }else{ 
           return "fail";}
       }else 
       {
           return "matchfail"; 
       }
    }
     }
    
    public String editProfile(String n,String ph,String g,java.sql.Date d,String s,String c,String a,String e) throws SQLException
    {
        editProfile.setString(1, n);
        editProfile.setString(2, ph);
        editProfile.setString(3,g);
        editProfile.setDate(4,d);
        editProfile.setString(5, s);
        editProfile.setString(6, c);
        editProfile.setString(7, a);
        editProfile.setString(8, e);
    int x=editProfile.executeUpdate();
    if(x!=0){
    return "Success";
    }else
        return "fail";
    }
    
    public byte[] getFile(int e) throws SQLException{
        try{
        getFile.setInt(1, e);
        ResultSet rs=getFile.executeQuery();
        if(rs.next()){
           byte[] b=rs.getBytes("ufile");
           if(b.length!=0){
           return b;
           }else return null;
        }return null;
        }catch(Exception ex){
        return null;
        }
        
    }
    
    public ArrayList <HashMap> getMessage(String s,String r) throws SQLException{
    getMessage.setString(1, s);
    getMessage.setString(2, r);
    ResultSet rs=getMessage.executeQuery();
    ArrayList <HashMap> allMessage=new ArrayList();
    while(rs.next()){
    HashMap message=new HashMap();
    message.put("message",rs.getString("message"));
    message.put("filename",rs.getString("filename"));
    message.put("ufile",rs.getBytes("ufile"));
    message.put("udate",rs.getString("udate"));
    message.put("pid",rs.getString("pid"));
    allMessage.add(message);
    }
    return allMessage;
    }
    
    public String getPassword(String e) throws SQLException{
    getPassword.setString(1, e);
    ResultSet rs=getPassword.executeQuery();
    if(rs.next())
    {
    return rs.getString("pass");
    }else
        return null;
    }
    
    public String sendMessage(String s,String r,String m,String f,InputStream is)throws SQLException{
    sendMessage.setString(1, s);
    sendMessage.setString(2, r);
    sendMessage.setString(3, m);
    sendMessage.setString(4, f);
    sendMessage.setBinaryStream(5, is);
    int x=sendMessage.executeUpdate();
    if(x==1){
    return "Done";
    }else{
        return "Error";
    }
} 
    
    public HashMap checkLogin(String e,String p)throws SQLException{
    checkLogin.setString(1, e);
    checkLogin.setString(2, p);
    ResultSet rs=checkLogin.executeQuery();
    if(rs.next()){
    HashMap userDetails=new HashMap();
    userDetails.put("email",rs.getString("email"));
    userDetails.put("name",rs.getString("name"));
    userDetails.put("phone",rs.getString("phone"));
    userDetails.put("gender",rs.getString("gender"));
    userDetails.put("dob",rs.getDate("dob"));
    userDetails.put("state",rs.getString("state"));
    userDetails.put("city",rs.getString("city"));
    userDetails.put("area",rs.getString("area"));
    return userDetails;
    }else{
    return null;
    }
    
    }
    public String insertUser(HashMap userDetails)throws SQLException{
        try{
        insertUser.setString(1, (String) userDetails.get("email"));
        insertUser.setString(2, (String) userDetails.get("pass"));
        insertUser.setString(3, (String) userDetails.get("name"));
        insertUser.setString(4, (String) userDetails.get("phone"));
        insertUser.setString(5, (String) userDetails.get("gender"));
        insertUser.setDate(6, (java.sql.Date) userDetails.get("dob"));
        insertUser.setString(7, (String) userDetails.get("state"));
        insertUser.setString(8, (String) userDetails.get("city"));
        insertUser.setString(9, (String) userDetails.get("area"));
        insertUser.setBinaryStream(10,(InputStream) userDetails.get("photo"));
        
        int x=insertUser.executeUpdate();
        if(x!=0)
        return "SUCCESS";
        else
        return "FAILED";
        }
        catch(java.sql.SQLIntegrityConstraintViolationException ex){
        return "ALREADY";
        }
    
    }
    public byte[] getPhoto(String e){
    try{
        getPhoto.setString(1, e);
        ResultSet rs=getPhoto.executeQuery();
        if(rs.next()){
        byte[] b=rs.getBytes("photo");
        if(b.length!=0){
        return b;
        }else{
        return null;
        }
        }else{
        return null;
        }
        
    }catch(SQLException ex){
        return null;
    }
    }
    public ArrayList<HashMap> searchPeople(String s,String c,String e,String a)
    {
        ArrayList<HashMap> allUserDetails=new ArrayList();
        try{
        searchPeople.setString(1, s);
        searchPeople.setString(2, c);
        searchPeople.setString(3, e);
        searchPeople.setString(4, "%"+a+"%");
        ResultSet r=searchPeople.executeQuery();
       
        //System.out.println(r);
        while(r.next()){
        //System.out.println(r.getString(1));
        HashMap UserDetails=new HashMap();
        UserDetails.put("name",r.getString("name"));
        UserDetails.put("email",r.getString("email"));
        UserDetails.put("phone",r.getString("phone"));
        UserDetails.put("dob",r.getDate("dob"));
        UserDetails.put("gender",r.getString("gender"));
        allUserDetails.add(UserDetails);
        }
       }catch(Exception ex)
        {
        ex.printStackTrace();
        }
   return allUserDetails; 
    }
  
    public HashMap getPeopleByEmail(String e){
    try{
        getPeopleByEmail.setString(1,e);
        ResultSet rs=getPeopleByEmail.executeQuery();
        if(rs.next()){
         HashMap userDetails=new HashMap();
         userDetails.put("email",rs.getString("email"));
         userDetails.put("name",rs.getString("name"));
         userDetails.put("phone",rs.getString("phone"));
         userDetails.put("gender",rs.getString("gender"));
         userDetails.put("dob",rs.getDate("dob"));
         userDetails.put("state",rs.getString("state"));
         userDetails.put("city", rs.getString("city"));
         userDetails.put("area",rs.getString("area"));
         return userDetails;
        }else{
        return null;
        }
       
    }catch(Exception ex){}
    return null;
    }
    
}
