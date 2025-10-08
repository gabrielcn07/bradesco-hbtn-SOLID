import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {

        try {
            // Criando logger
            Logger logger = Logger.getLogger("MyLog");

            // Configurando FileHandler
            FileHandler fileHandler = new FileHandler("logs.txt");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            // Adicionando handler ao logger
            logger.addHandler(fileHandler);

            // Logs de teste
            logger.info("Teste de Log");
            logger.info("Olá, eu sou o teste da classe principal");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
