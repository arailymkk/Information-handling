package textParts;

import java.util.ArrayList;
import java.util.List;

public class Lexeme{
    private String word;
    private List<String> symbols;
    private boolean beginsWithWord;

    public Lexeme() {
        this.symbols = new ArrayList<String>();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<String> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<String> symbols) {
        this.symbols = symbols;
    }

    public boolean isBeginsWithWord() {
        return beginsWithWord;
    }

    public void setBeginsWithWord(boolean beginsWithWord) {
        this.beginsWithWord = beginsWithWord;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        int symbolsSize = symbols.size();
        if(beginsWithWord) {
            sb.append(word);
            if(symbolsSize > 0) {
                sb.append(symbols.get(0));
            }
        }
        if(!beginsWithWord) {
            sb.append(symbols.get(0));
            if(word != null) {
                sb.append(word);
                if(symbolsSize > 1) {
                    sb.append(symbols.get(1));
                }
            }
        }
        return sb.toString();
    }
}
