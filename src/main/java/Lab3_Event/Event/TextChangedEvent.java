package Lab3_Event.Event;

public class TextChangedEvent {
    private final String newText;

    public TextChangedEvent(String newText) {
        this.newText = newText;
    }

    public String getNewText() {
        return newText;
    }
}
