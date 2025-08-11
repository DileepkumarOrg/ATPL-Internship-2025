public class SystemUtils {

    static class Logger {
        String logged;
        Logger(String logged){
            this.logged = logged;

        }
        public void log(){
            System.out.println(logged);
        }
        
    }

    public static void main(String[] args) {
        Logger loggerObj = new Logger("Message 1");
        loggerObj.log();
        Logger loggerObj2 = new Logger("Message 2");
        loggerObj2.log();
    }
}