package creational.singleton;

public class Program {
    public static void main(String[] args) {
        ProgrammLogger firstLogger = ProgrammLogger.getProgrammLogger();
        ProgrammLogger secondLogger = ProgrammLogger.getProgrammLogger();

        firstLogger.addLogInfo("Application started");
        secondLogger.addLogInfo("Application finished");
        System.out.println("Logger instances are the same: " + (firstLogger == secondLogger));
        firstLogger.showLogFile();

        DatabaseHelper databaseHelper = DatabaseHelper.getInstance();
        databaseHelper.getData();
        databaseHelper.executeQuery("SELECT * FROM instances LIMIT 1");
    }
}