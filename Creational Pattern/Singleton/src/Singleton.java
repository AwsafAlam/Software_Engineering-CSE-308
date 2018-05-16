public class Singleton {

    public static void main(String[] args) {

        DbConnection myconn = DbConnection.getDbConnection();

        DbConnection myconn1 = DbConnection.getDbConnection();


    }
}
