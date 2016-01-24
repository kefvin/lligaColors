package lligaDelsColors.lligaColors;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

/**
 * Hello world!
 *
 */
public class App extends DefaultHandler {

	public static void main(String[] args) {

		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser parser = spf.newSAXParser();
			parser.parse(new File("test.xml"), new App());

		} catch (Exception e) {

		}

	}
}
