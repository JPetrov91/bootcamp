package org.extra07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javassist.convert.Transformer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ExampleXML {

	public final String RELATIVE_PATH_TO_GENERATED_XML = "./src/main/java/org/extra07/example.xml";
	public final String RELATIVE_PATH_TO_XSD = "./src/main/java/org/extra07/car.xsd";

	private String model;
	private String color;
	private int year;
	private int price;

	public ExampleXML(String model, String color, int year, int price) {
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	public static void main(String[] args) {
		ExampleXML example = new ExampleXML("df", "gf", 15, 25);
		try {
			example.createXML();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Creates an XML file.
	 * 
	 * @return type boolean
	 * 
	 * @throws Exception
	 */
	public boolean createXML() throws Exception {
			try {
		         org.dom4j.Document document = DocumentHelper.createDocument();
		         org.dom4j.Element rootElement = document.addElement( "car" );
		         rootElement.addElement("model").addText(this.model);
		         rootElement.addElement("color").addText(this.model);
		         rootElement.addElement("year").addText(String.valueOf(this.year));
		         rootElement.addElement("price").addText(String.valueOf(this.price));
			
			
			FileOutputStream fos = new FileOutputStream(RELATIVE_PATH_TO_GENERATED_XML);
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(fos, format);
			writer.write(document);
			writer.flush();
//		         OutputFormat format = OutputFormat.createPrettyPrint();
//		         XMLWriter writer;
//		         writer = new XMLWriter( System.out, format );
//		         writer.write( document );
			return true;
			} catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public void createContent(Element rootElement, Document doc, String name, String type) {
			Element element = doc.createElement(name);
			element.appendChild(doc.createTextNode(type));
			rootElement.appendChild(element);
		}

	         // Pretty print the document to System.out
//	         OutputFormat format = OutputFormat.createPrettyPrint();
//	         XMLWriter writer;
//	         writer = new XMLWriter( System.out, format );
//	         writer.write( document );
//	         FileOutputStream fos = new FileOutputStream(RELATIVE_PATH_TO_GENERATED_XML);
//	         OutputFormat format = OutputFormat.createPrettyPrint();
//	         XMLWriter writer = new XMLWriter(fos, format);
//	         writer.write(document);
//	         writer.flush();
//	         return true;
//	      } catch (UnsupportedEncodingException e) {
//	          e.printStackTrace();
//	          return false;
//	       } catch (IOException e) {
//	          e.printStackTrace();
//	          return false;
//	       }


	/**
	 * Validates XML file
	 * 
	 * @param xsdPath
	 *            path to .xsd file
	 * @param xmlPath
	 *            path to .xml file
	 * 
	 * @return type boolean
	 * @throws Exception
	 */
	public boolean validateXMLSchema(String xsdPath, String xmlPath) throws Exception {
		// TODO No. 2: Write a code to validate prepared XML file according to
		// .xsd file
		// Note that Exception should be thrown, if passed XML file is invalid.
		return false;
	}

}