package comparators;

import textParts.*;

import java.util.Comparator;

public class ParagraphComparator implements Comparator<Paragraph> {

    public int compare(Paragraph p1, Paragraph p2) {
        if (p1.getSentencesSize() == p2.getSentencesSize()) {
            return 0;
        }

        else if (p1.getSentencesSize() > p2.getSentencesSize()) {
            return 1;
        }

        else {
            return -1;
        }
    }

}
