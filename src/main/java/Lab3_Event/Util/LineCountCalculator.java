package Lab3_Event.Util;

public class LineCountCalculator {
    public int calculateLineCount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.split("\n").length; // Подсчет строк
    }
}
