package comparators;

import java.util.Comparator;

public class WordsComparatorByLength implements Comparator<String> {

    public int compare(String w1, String w2) {
        if(w1.length() == w2.length()) {
            return 0;
        }
        else if(w1.length() > w2.length()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
