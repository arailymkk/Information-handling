package parsers;
import textParts.*;

public abstract class Parser {
    private Parser next;

    public void parse(String str, Paragraph paragraph) {}

    public void parse(String str, Text text) {}

    public void parse(String str, Sentence sentence) {}

    public void setNext(Parser next) {
        this.next = next;
    }

    public Parser getNext() {
        return next;
    }
}
