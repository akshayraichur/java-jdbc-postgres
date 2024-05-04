import java.sql.*;

public class DemoJdbc {
    public static void main(String[] arg) throws Exception{
        /**
         * import package
         * load & register
         * create connection
         * create statement
         * execute statement
         * process the results
         * exit
         */

        String DB_URL = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres", password = ""; // give your own password
        String query = "select * from student";

        Class.forName("org.postgresql.Driver"); // this is optional
//        System.out.println(String.format("%s", System.getenv("DB_URL")));
        Connection con = DriverManager.getConnection(DB_URL, username, password);
//        System.out.println("Load, register & connection");

//        Statement creation
        Statement st = con.createStatement();
//        For reading in CRUD
        ResultSet dbResponse = st.executeQuery(query);

//        to get only one column name
//        dbResponse.next();
//        System.out.println(dbResponse.getString("name"));

//        System.out.println("SID : Marks : Name");
//        while(dbResponse.next()){
//            System.out.print(dbResponse.getInt(1) + " : ");
//            System.out.print(dbResponse.getInt((2)) + " : ");
//            System.out.println(dbResponse.getString(3));
//        }
//        END OF Read in CRUD

//        ON TO CREATE in CRUD
//        String insertDataQuery = "insert into student values(10,44,'Rahul')";
//        st.execute(insertDataQuery);

//        UPDATE in CRUD
//        String updateQuery = "update student set name='Max' where sid=10";
//        st.execute(updateQuery);

//        DELETE in CRUD
//        String deleteQuery = "delete from student where sid=10";
//        st.execute(deleteQuery);



        con.close();


    }
}
