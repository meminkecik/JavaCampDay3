package homework2.lesson38Polymorphism;

public class ConsoleLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged to console: " + message);
    }
}
