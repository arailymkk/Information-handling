package textParts;

import java.util.ArrayList;
import java.util.List;

public class Sentence{
    private List<Lexeme> lexemes;

    public Sentence() {
        this.lexemes = new ArrayList<Lexeme>();
    }

    public List<Lexeme> getLexemes() {
        return lexemes;
    }

    public void setLexemes(List<Lexeme> lexemes) {
        this.lexemes = lexemes;
    }

    public int wordCount() {
        int count = 0;
        for(Lexeme lexeme: lexemes) {
            if(lexeme.getWord() != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lexemes.size(); i++) {
            if(i != 0) {
                sb.append(" " + lexemes.get(i));
            }
            else {
                sb.append(lexemes.get(i));
            }
        }
        return sb.toString();
    }
}
