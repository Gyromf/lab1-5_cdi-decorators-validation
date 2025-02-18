package Lab3_Event;

import Lab3_Event.Event.TextChangedEvent;
import Lab3_Event.Util.LineCountCalculator;
import Lab3_Event.Util.PageCountCalculator;
import Lab3_Event.Util.TextContent;
import Lab3_Event.Util.WordCountCalculator;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class MetricsObserver {
    private final WordCountCalculator wordCalculator = new WordCountCalculator();
    private final LineCountCalculator lineCalculator = new LineCountCalculator();

    public void onTextChanged(@Observes TextChangedEvent event) {
        String newText = event.getNewText();

        if (newText == null || newText.isBlank()) {
            System.out.println("\n Текст отсутствует.");
            return;
        }

        int wordCount = wordCalculator.calculateWordCount(newText);
        int lineCount = lineCalculator.calculateLineCount(newText);
        PageCountCalculator pageCalculator = new PageCountCalculator(new TextContent(newText, 25));
        int pageCount = pageCalculator.calculatePageCount();

        System.out.println("\n Текст изменен!");
        System.out.println(" Количество слов: " + wordCount);
        System.out.println(" Количество строк: " + lineCount);
        System.out.println(" Количество страниц: " + pageCount);
    }
}
