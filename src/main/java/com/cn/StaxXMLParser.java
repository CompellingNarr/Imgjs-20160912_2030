package com.cn;

import com.sun.istack.internal.XMLStreamException2;
import com.sun.xml.internal.stream.XMLEventReaderImpl;
import com.sun.xml.internal.stream.buffer.XMLStreamBuffer;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.beans.XMLEncoder;

import java.io.FileNotFoundException;
import v

/**
 * Created by robertweidlich on 9/12/16.
 */
public class StaxXMLParser {
    public StaxXMLParser(String pathName) {
        System.out.println("StaxXMLParser.ctor");
        this.parse(pathName);
    }

    private void parse(String pathName) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(pathName));

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (XMLStreamException e) {
            e.printStackTrace();
        }

    }
}
