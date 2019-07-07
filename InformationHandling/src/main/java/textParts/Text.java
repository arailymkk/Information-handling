package textParts;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Paragraph> paragraphs;

    public Text() {
        this.paragraphs = new ArrayList<Paragraph>();
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (Paragraph paragraph: paragraphs) {
            sb.append(paragraph + "\n");
        }
        return sb.toString();
    }
}
