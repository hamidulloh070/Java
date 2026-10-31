package creational.singleton;

public class ProgrammLogger {
    private String logFile = "This is log file. \n";

    private ProgrammLogger() {}

    private static class Holder {
        private static final ProgrammLogger INSTANCE = new ProgrammLogger();
    }

    public static ProgrammLogger getProgrammLogger() {
        return Holder.INSTANCE;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
