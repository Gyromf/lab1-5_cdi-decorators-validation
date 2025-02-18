package Lab3_Event.Util;

public class WordCountCalculator {
    public int calculateWordCount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.split("\\s+").length; // Подсчет слов
    }
}
