package cleanCode;

import java.util.Date;
import java.util.List;

public class Comments {

    // TODO Este método deve ser removido
    public void check() {
        return;
    }

    /**
     * Este método retorna o proprietário do caso de teste.
     * @param testcase o caso de teste
     * @return Owner do testcase
     */
    public Owner getTestcaseOwner(Testcase testcase) {
        // implementação fictícia
        return null;
    }

    /**
     * Retorna horas em um trimestre.
     * @return Hours total
     */
    public Hours getHoursInQuarter() {
        // implementação fictícia
        return null;
    }

    /**
     * Este método publica resultados com base na data.
     * @param date data a partir da qual os resultados devem ser publicados
     * @return Lista de entidades de resultado
     */
    public List<Result> publishResults(Date date) {
        // implementação fictícia
        return null;
    }

    // Classes fictícias para compilação
    public static class Owner {}
    public static class Testcase {}
    public static class Hours {}
    public static class Result {}
}
