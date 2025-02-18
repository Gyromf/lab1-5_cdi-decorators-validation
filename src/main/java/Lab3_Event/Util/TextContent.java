package Lab3_Event.Util;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TextContent {
    private String content; // Текст
    private int maxLinesPerPage; // Максимальное количество строк на странице

    @Override
    public String toString() {
        return "Текст: " + content + ", Максимальное количество строк на странице: " + maxLinesPerPage;
    }
}
