import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import parsers.*;
import textParts.*;
import individualTasks.*;


public class TextReader {
    public static void main(String[] args) {
        final Logger LOGGER = LogManager.getLogger(TextReader.class);

        //Creating parser class objects
        Parser textParser = new TextParser();
        Parser paragraphParser = new ParagraphParser();
        Parser sentenceParser = new SentenceParser();
        Parser lexemeParser = new LexemeParser();

        //Chaining parser classes
        textParser.setNext(paragraphParser);
        paragraphParser.setNext(sentenceParser);
        sentenceParser.setNext(lexemeParser);

        Text text = new Text();
        textParser.parse("data/text.txt", text);
        //Printing file as a primary text using toString()
        LOGGER.info(text);

        //Testing individual tasks
        TextSortingTasks sort = new TextSortingTasks();

        LOGGER.info("Not sorted sentence:");
        LOGGER.info(text.getParagraphs().get(0).getSentences().get(1));
        LOGGER.info("Sorted sentence by word length:");
        LOGGER.info(sort.sortSentenceByWordLength(text.getParagraphs().get(0).getSentences().get(1)));
        LOGGER.info(text.getParagraphs().get(1).getSentences());
        sort.sortSentencesByWordCount(text.getParagraphs().get(1));
        LOGGER.info(text.getParagraphs().get(1).getSentences());
        sort.sortParagraphsBySentenceCount(text);
        LOGGER.info(text);

    }
}
