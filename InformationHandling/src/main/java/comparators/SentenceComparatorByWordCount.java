package comparators;

import textParts.*;

import java.util.Comparator;

public class SentenceComparatorByWordCount implements Comparator<Sentence> {

    public int compare(Sentence s1, Sentence s2) {
        if(s1.wordCount() == s2.wordCount()) {
            return 0;
        }
        else if(s1.wordCount() > s2.wordCount()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
