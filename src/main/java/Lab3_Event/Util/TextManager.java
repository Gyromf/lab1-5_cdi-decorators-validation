package Lab3_Event.Util;

import Lab3_Event.Event.TextChangedEvent;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

public class TextManager {
    private String text;
    private final int maxLinesPerPage = 25; // Максимальное количество строк на странице

    @Inject
    private Event<TextChangedEvent> textChangedEvent; // CDI событие

    public TextManager() {
        this.text = "";
    }

    public void setText(String newText) {
        this.text = newText;
        textChangedEvent.fire(new TextChangedEvent(newText)); // Отправляем событие
    }

    public String getText() {
        return text;
    }

    public int getMaxLinesPerPage() {
        return maxLinesPerPage;
    }
}
