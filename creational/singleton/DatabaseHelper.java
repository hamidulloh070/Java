package creational.singleton;

public class DatabaseHelper {
    private DatabaseHelper() {}

    private static class Holder {
        private static final DatabaseHelper INSTANCE = new DatabaseHelper();
    }

    public static DatabaseHelper getInstance() {
        return Holder.INSTANCE;
    }

    public void getData() {
        System.out.println("Ma'lumotlar olindi");
    }

    public void executeQuery(String query) {
        System.out.println("So'rov bajarildi: " + query);
    }
}
