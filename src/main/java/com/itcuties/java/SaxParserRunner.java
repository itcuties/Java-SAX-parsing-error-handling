package com.itcuties.java;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParserRunner {
	public static void main(String[] args) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
			factory.setValidating(true);
			// Using factory we create a new SAX Parser instance
			SAXParser saxParser = factory.newSAXParser();
			
			// We need the SAX parser handler object
			CustomParseHandler handler = new CustomParseHandler();
			// We call the method parsing our RSS Feed
			// Parse valid XML
			//saxParser.parse(new File("input/valid-file.xml"), handler);
			
			// Parse error XML
			//saxParser.parse(new File("input/error-file.xml"), handler);
			
			// Parse fatal error XML
			saxParser.parse(new File("input/fatalerror-file.xml"), handler);
			
		} catch (ParserConfigurationException pce) {
			//pce.printStackTrace();
			// FIXME: Do nothing at the moment 
		} catch (SAXException se) {
			//se.printStackTrace();
			// FIXME: Do nothing at the moment 
		} catch (IOException ioe) {
			//ioe.printStackTrace();
			// FIXME: Do nothing at the moment 
		}
	}
}
