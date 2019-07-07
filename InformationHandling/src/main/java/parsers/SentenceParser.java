package parsers;

import textParts.*;

public class SentenceParser extends Parser {

    @Override
    public void parse(String unparsedSentence, Paragraph paragraph) {
        Sentence sentence = new Sentence();
        String [] lexemes = unparsedSentence.split("\\s");
        for (int j = 0; j < lexemes.length; j++) {
            if(super.getNext() != null) {
                super.getNext().parse(lexemes[j], sentence);
            }
        }
        paragraph.getSentences().add(sentence);
    }
}
