/**
 * 
 */
package org.extra07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.helpers.AttributesImpl;


public class XMLCar {

	public final String RELATIVE_PATH_TO_GENERATED_XML = "./src/main/java/org/extra07/car_sale.xml";
	public final String RELATIVE_PATH_TO_XSD = "./src/main/java/org/extra07/car.xsd";

	private String model;
	private String color;
	private int year;
	private int price;

	public XMLCar(String model, String color, int year, int price) {
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	public static void main(String[] args) {
		XMLCar xcar = new XMLCar("11", "tt", 15, 22);
		try {
			xcar.createXML();
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
		// TODO No. 1: Write a code that will create XML file car_sale.xml
		// that matches car.xsd requirements.
		// HINT look at:
		// https://docs.oracle.com/javase/7/docs/api/javax/xml/parsers/DocumentBuilderFactory.html
//		try {
//		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//
//		// root elements
//		Document doc = docBuilder.newDocument();
//		Element rootElement = doc.createElement("car");
//		doc.appendChild(rootElement);
//
//		createContent(rootElement, doc, "model", this.model);
//		createContent(rootElement, doc, "color", this.color);
//		createContent(rootElement, doc, "year", String.valueOf(this.year));
//		createContent(rootElement, doc, "price", String.valueOf(this.price));
//
//
//		// write the content into xml file
//		TransformerFactory transformerFactory = TransformerFactory.newInstance();
//		javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
//		DOMSource source = new DOMSource(doc);
//		StreamResult result = new StreamResult(new File(RELATIVE_PATH_TO_GENERATED_XML));
//
//		// Output to console for testing
//		// StreamResult result = new StreamResult(System.out);
//
//		transformer.transform(source, result);
//
//		System.out.println("File saved!");
//		return true;
//		} catch(Exception e) {
//			System.out.println(e);
//			return false;
//		}
//
//	}
		
//		StringWriter stringWriter = new StringWriter();
//		XMLOutputFactory factory = XMLOutputFactory.newInstance();
//		XMLStreamWriter writer = factory.createXMLStreamWriter(stringWriter);
//		writer.writeStartDocument();
//		writer.writeStartElement("car");
//		writer.writeStartElement("model");
//		writer.writeEndElement();
//		writer.writeStartElement("color");
//		writer.writeEndElement();
//		writer.writeStartElement("year");
//		writer.writeEndElement();
//		writer.writeStartElement("price");
//		writer.writeEndElement();
//		writer.writeEndElement();
//		
//		TransformerFactory transformerFactory = TransformerFactory.newInstance();
//		javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
//		DOMSource source = new DOMSource(doc);
//		StreamResult result = new StreamResult(new File(RELATIVE_PATH_TO_GENERATED_XML));
//
//		// Output to console for testing
//		// StreamResult result = new StreamResult(System.out);
//
//		transformer.transform(source, result);
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
//		Source xmlFile = new StreamSource(new File(xmlPath));
//		Source xsdFile = new StreamSource(new File(xsdPath));
		SchemaFactory sFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = sFactory.newSchema(new File(xsdPath));
		Validator validator = schema.newValidator();
		try {
			validator.validate(new StreamSource(new File(xmlPath)));
			System.out.println("XML is valid");
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
}