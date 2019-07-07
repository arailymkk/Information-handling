package parsers;

import textParts.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser extends Parser {

    public void parse(String unparsedLexeme, Sentence sentence) {
        Lexeme lexeme = new Lexeme();
        Pattern p1 = Pattern.compile("[a-zA-Z0-9\\-]*");
        Matcher m1 = p1.matcher(unparsedLexeme);
        if(m1.matches()) {
            lexeme.setWord(unparsedLexeme);
            lexeme.setBeginsWithWord(true);
        }

        else if(unparsedLexeme.matches("([a-zA-Z0-9\\-]+[^a-zA-Z0-9\\-]+)")) {
            String wordPart = unparsedLexeme.replaceAll("[^a-zA-Z0-9\\-]", "");
            String symbolsPart = unparsedLexeme.replaceAll("[a-zA-Z0-9\\-]", "");
            lexeme.setWord(wordPart);
            lexeme.getSymbols().add(symbolsPart);
            lexeme.setBeginsWithWord(true);
        }

        else if(unparsedLexeme.matches("([^a-zA-Z0-9\\-]+[a-zA-Z0-9\\-]+)")) {
            String wordPart = unparsedLexeme.replaceAll("[^a-zA-Z0-9\\-]", "");
            String symbolsPart = unparsedLexeme.replaceAll("[a-zA-Z0-9\\-]", "");
            lexeme.setWord(wordPart);
            lexeme.getSymbols().add(symbolsPart);
            lexeme.setBeginsWithWord(false);
        }

        else if(unparsedLexeme.matches("([^a-zA-Z0-9\\-]+[a-zA-Z0-9\\-]+[^a-zA-Z0-9\\-]+)")) {
            String wordsPart = unparsedLexeme.replaceAll("[^a-zA-Z0-9\\-]", "");
            String firstSymbol =unparsedLexeme.replaceAll("([a-zA-Z0-9\\-]+[^a-zA-Z0-9\\-]+)", "");
            String secondSymbol =unparsedLexeme.replaceAll("([^a-zA-Z0-9\\-]+[a-zA-Z0-9\\-]+)", "");
            lexeme.setWord(wordsPart);
            lexeme.getSymbols().add(firstSymbol);
            lexeme.getSymbols().add(secondSymbol);
            lexeme.setBeginsWithWord(false);
        }

        else {
            lexeme.getSymbols().add(unparsedLexeme);
            lexeme.setBeginsWithWord(false);
        }
        sentence.getLexemes().add(lexeme);
    }

}
