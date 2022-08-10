package Singleton.DB;

public class Database {
    //private static Database database; ->Method1
    private static Database database = new Database(); //Method 2
    private Database(){
        System.out.println("Creating Database instance");
    }

    public static Database getInstance() {
//        if(database == null) //Method1
//        {
//            database = new Database();
//        }
        return database;
    }
}
