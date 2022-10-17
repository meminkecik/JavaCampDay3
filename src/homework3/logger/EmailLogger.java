package homework3.logger;

public class EmailLogger implements Logger {
    public void log(String message){
        System.out.println("Emaile loglandı : " +message);
    }
}
