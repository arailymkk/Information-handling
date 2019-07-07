package individualTasks;

import comparators.*;
import textParts.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextSortingTasks {

    public void sortParagraphsBySentenceCount(Text text) {
        Collections.sort(text.getParagraphs(), new ParagraphComparator());
    }

    public List<String> sortSentenceByWordLength(Sentence sentence){
        List<String> wordsList = new ArrayList<String>();
        for(Lexeme lexeme: sentence.getLexemes()){
            if(lexeme.getWord() != null) {
                wordsList.add(lexeme.getWord());
            }
        }
        Collections.sort(wordsList, new WordsComparatorByLength());
        return wordsList;
    }

    public void sortSentencesByWordCount(Paragraph paragraph) {
        Collections.sort(paragraph.getSentences(), new SentenceComparatorByWordCount());
    }

}
