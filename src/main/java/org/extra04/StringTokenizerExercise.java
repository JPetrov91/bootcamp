package org.extra04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Student
 * 
 *         This class represents string tokenizer exercise. DO TASK IN STUDENT
 *         CLASS FIRST BEFORE YOU START DOING THIS TASK!
 */
public class StringTokenizerExercise {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		StringTokenizerExercise ste = new StringTokenizerExercise();
		List<String> list = ste.tokenizeString("1;John;Doe;27173829;", ";");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		List<Student> students = ste.createFromFile("/home/student/workspace/Jurijs_Petrovs/src/main/java/org/extra04/students.txt", ";");
		for(Student student : students) {
			System.out.println(student.getID());
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName());
			System.out.println(student.getPhoneNumber());
		}
	}
	public String[] splitString(String text, String delimiter) {
		String[] list = null;
		// TODO # 1 Split passed text by given delimiter and return array with
		// split strings.
		// HINT: Use System.out.println to better understand split method's
		// functionality.
		list = text.split(delimiter);
		return list;
	}

	public List<String> tokenizeString(String text, String delimiter) {
		// TODO # 2 Tokenize passed text by given delimiter and return list with
		// tokenized strings.
		List<String> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(text, delimiter);
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		return list;
	}

	public List<Student> createFromFile(String filepath, String delimiter) throws FileNotFoundException, IOException {
		File students = new File(filepath);
		List<Student> list = new ArrayList<Student>();
		BufferedReader in = null;
		// TODO # 3 Implement method which reads data from file and creates
		// Student objects with that data. Each line from file contains data for
		// 1 Student object.
		// Add students to list and return the list. Assume that all passed data
		// and
		// files are correct and in proper form.
		// Advice: Explore StringTokenizer or String split options.
		in = new BufferedReader(new FileReader(students));
		String line = "";
		while((line = in.readLine()) != null) {
			List<String> strList = tokenizeString(line, delimiter);
			list.add(new Student(Integer.parseInt(strList.get(0)), strList.get(1), strList.get(2), Integer.parseInt(strList.get(3))));
//			Student student = new Student();
//			System.out.println(strList);
//			student.setID(Integer.parseInt(strList.get(0)));
//			System.out.println(student.getID());
//			student.setFirstName(strList.get(1));
//			System.out.println(student.getFirstName());
//			student.setLastName(strList.get(2));
//			System.out.println(student.getLastName());
//			student.setPhoneNumber(Integer.parseInt(strList.get(3)));
//			System.out.println(student.getPhoneNumber());
			//list.add(student);
			//in.readLine();
		}
		in.close();
		return list;
	}

}
