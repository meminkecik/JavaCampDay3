package homework3.logger;

public class FileLogger implements Logger {
    public void log(String message){
        System.out.println("Dosyaya loglandı : " +message);
    }
}
