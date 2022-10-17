package homework3.logger;

public class DatabaseLogger implements Logger {
    public void log(String message){
        System.out.println("Veritabanına loglandı : " +message);
    }
}
