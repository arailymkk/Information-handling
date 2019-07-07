package parsers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import textParts.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextParser extends Parser {
    private static final Logger LOGGER = LogManager.getLogger(TextParser.class);

    @Override
    public void parse(String fileName, Text text){
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
            String line = br.readLine();
            while (line != null) {
                if(super.getNext() != null) {
                    super.getNext().parse(line, text);
                }
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            LOGGER.error(e);
        } catch (IOException e) {
            LOGGER.error(e);
        }

    }
}
