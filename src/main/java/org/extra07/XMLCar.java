/**
 * 
 */
package org.extra07;


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
		return false;

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
		return false;
	}

}
