package parsers;

import textParts.*;

public class ParagraphParser extends Parser {

    @Override
    public void parse(String unparsedParagraph, Text text) {
        Paragraph paragraph = new Paragraph();
        String [] sentences = unparsedParagraph.split("\\.\\s");
        for (int i = 0; i < sentences.length; i++) {
            if (super.getNext() != null) {
                super.getNext().parse(sentences[i], paragraph);
            }
        }
        text.getParagraphs().add(paragraph);
    }
}
