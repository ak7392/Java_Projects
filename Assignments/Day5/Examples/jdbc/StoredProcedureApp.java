package Day5.jdbc;

import java.sql.*;

public class StoredProcedureApp {


	public static void main(String[] args) throws Exception 
	{
		CallableStatement statement=null;

		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
        System.out.println("---connected---");
        statement = c1.prepareCall("{call getEmpName(?,?)}");
        statement.setInt(1,new Integer(123));
        statement.registerOutParameter(2, java.sql.Types.VARCHAR);

       // statement.setString(2,"Maruthi");
        System.out.println("Executing stored procedure..." );
        String empName = statement.getString(2);
        System.out.println(empName);
        statement.execute();

        /*boolean hadResults=statement.execute();
        while (hadResults) {
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                // retrieve values of fields
        String title = resultSet.getString(2);
        System.out.println(title);
                 
            }*/
        ///}
		
       /* String s=(String)statement.getObject(2,String.class);
        System.out.println(s);
       */ statement.close();
        	System.out.println("Stored procedure called successfully!");

	}
}
