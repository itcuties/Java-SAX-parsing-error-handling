package com.itcuties.java;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomParseHandler extends DefaultHandler {
	
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
    	System.out.print("<"+qName+">");
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
    	System.out.print("</"+qName+">");
    }
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       System.out.print("\t" + new String(ch, start, length));
    }
 
    @Override
    public void error(SAXParseException e) throws SAXException {
    	System.out.println("Error: " + e.getMessage());
    }
 
    @Override
    public void fatalError(SAXParseException e) throws SAXException {
    	System.out.println("Fatal error: " + e.getMessage());
    }
    
}
