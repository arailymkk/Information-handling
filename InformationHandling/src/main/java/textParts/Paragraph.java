package textParts;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private List<Sentence> sentences;

    public Paragraph() {
        this.sentences = new ArrayList<Sentence>();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public int getSentencesSize () {
        return sentences.size();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (Sentence sentence: sentences) {
            sb.append(sentence + ".");
        }
        return sb.toString();
    }
}
