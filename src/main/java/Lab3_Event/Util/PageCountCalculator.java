package Lab3_Event.Util;

public class PageCountCalculator {
    private final TextContent textContent;

    public PageCountCalculator(TextContent textContent) {
        this.textContent = textContent;
    }

    public int calculatePageCount() {
        if (textContent.getContent() == null || textContent.getContent().isEmpty()) {
            return 0;
        }
        int lineCount = textContent.getContent().split("\n").length;
        int maxLinesPerPage = textContent.getMaxLinesPerPage();
        return (int) Math.ceil((double) lineCount / maxLinesPerPage);
    }
}
