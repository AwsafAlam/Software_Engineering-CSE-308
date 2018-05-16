public class DbConnection {

    private static final String dbUser = "Awsaf";
    private static final String dbPassword = "password";
    private static final String dbName = "Employee";


    private static DbConnection instance = null;
    private SQLConnection connection;

    private DbConnection(){

      connection = connecttoDatabase(dbUser , dbPassword , dbName);
    }

    public static DbConnection getDbConnection(){
        if(instance == null){
            System.out.println("Waiting for connection..... ");
            instance = new DbConnection();
        }
        System.out.println("Finished...");
        return instance;
    }

    private SQLConnection connecttoDatabase(String dbUser, String dbPassword, String dbName){
        return new SQLConnection(DbConnection.dbUser, DbConnection.dbPassword, DbConnection.dbName);
    }


}
