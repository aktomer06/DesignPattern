package Singleton.DB;

public class client {
    public static void main(String[] args) {
        Database databaseInstance = Database.getInstance();

        Database anotherInstanceOfdatabase = Database.getInstance();
    }
}
