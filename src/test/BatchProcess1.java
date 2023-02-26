package test;
import java.sql.*;
public class BatchProcess1 {
	public static void main(String[] args) {
    try
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	Connection con=DriverManager.getConnection
    			("jdbc:oracle:thin:@localhost:1521:xe","AZAD","Azad");
    	Statement stm=con.createStatement();
    	stm.addBatch("insert into employee44 values('DB222','Afzal',1400,'me')");
    	stm.addBatch("insert into book44 values ('DB124','c-java','aaaa',234,23)");
    	stm.addBatch("update employee44 set sal=40000 where eno='DB111'");
    	int k[]=stm.executeBatch();
    	for(int i=0;i<k.length;i++)
    	{
    		System.out.println("Update Suceessfull....");
    	}  // end of loop
    	stm.clearBatch();
    }  // end of try
    catch(Exception e)
    {
    	e.printStackTrace();
    }
	}
}
