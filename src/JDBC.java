import java.sql.*;


public class JDBC {

    private static String url = "jdbc:mysql://localhost:3306/test_schema";
    private static String user = "root";
    private static String password;


    public static void main(String[] args){

//        insert(0, "Null", "Null", 0, 0, 0);
//
//        try{
//            Connection connection = DriverManager.getConnection(url, user, password);
//
//            Statement statement = connection.createStatement();
//
//            ResultSet resultSet = statement.executeQuery("select * from test_table");
//
//            while(resultSet.next()) {
//                System.out.println(resultSet.getString("firstname"));
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }



    public static void insert(int id, String lastname, String firstname, int age, int weight, int height){
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String insert_query = "INSERT INTO test_table "
                    + "VALUES (" + id + "," + "'" + lastname + "'" + "," + "'" + firstname +"'" +
                    "," + age + "," +
                    weight + "," + height + ")";
            statement.executeUpdate(insert_query);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("User " + firstname + " " + lastname + " " + "Inserted Successfully");
        System.out.println("**************************************");
    }

}
