package org.testSuite;

import org.activity02.HelloTest;
import org.activity03.ArrayTest;
import org.activity03.BlackKnightTest;
import org.activity03.RandomPersonTest;
import org.activity03.ZodiacTest;
import org.activity04.TrafficManagementTest;
import org.activity05.EncapsulationTest;
import org.activity06.HumanTest;
import org.activity06.MartianTest;
import org.activity07.AnimalTest;
import org.activity07.BirdTest;
import org.activity07.DogTest;
import org.activity07.HawkTest;
import org.activity07.MammalTest;
import org.activity08.SimpleCalcTest;
import org.activity09.ComparisionTest;
import org.activity09.OrderListTest;
import org.activity09.OrderTest;
import org.activity10.StreamEditorTest;
import org.activity11.ArrayFillerManagerTest;
import org.activity12.ChatServerTest;
import org.activity13.DatabaseTest;
import org.activity14.DatabaseUnitTest;
import org.activity15.ColorSliderTest;
import org.activity16.SampleJettyApplicationTests;
import org.apache.log4j.Logger;
import org.extra01.BasicMathFunctionsTest;
import org.extra01.GetOneTest;
import org.extra01.If_SwitchTest;
import org.extra02.LetsRideTest;
import org.extra02.OwlFarmTest;
import org.extra02.OwlTest;
import org.extra03.ArrayListMethodsTest;
import org.extra04.StringTokenizerExerciseTest;
import org.extra04.StudentTest;
import org.extra05.ChatClientTest;
import org.extra06.InvoiceManagerTest;
import org.extra07.XMLCarTest;
import org.extra08.GenericsTest;
import org.extra08.HolidayTest;
import org.extra08.RegExTest;
import org.extra09.BoardTest;
import org.extra09.CrocodileTest;
import org.extra09.GameTest;
import org.extra10.PracticalNumbersTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runners.MethodSorters;

// TODO should change design that tests are added to testObject suite dynamically
// so that testObject tree is properly shown in JUnit view

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AllTests {
	Logger logger = Logger.getLogger(AllTests.class.getName());
	int totalTests = 0;
	int passedTests = 0;
	int totalExercises;
	float passedExercises = 0f;
	String exerciseNames = "";
	String exerciseResults = "";
	String curpack = "";
	String prevpack = "";

	/**
	 * Total timeout for the whole test suite
	 */
	@Test(timeout = 60000)
	public void allTests() {
		printStat(
				// First week
				HelloTest.class,
				ArrayTest.class,
				BlackKnightTest.class,
				RandomPersonTest.class,
				ZodiacTest.class,
				TrafficManagementTest.class,
				EncapsulationTest.class,
				HumanTest.class,
				MartianTest.class,
				AnimalTest.class,
				BirdTest.class,
				DogTest.class,
				HawkTest.class,
				MammalTest.class,
				SimpleCalcTest.class,

				// Second week
				ComparisionTest.class,
				OrderListTest.class,
				OrderTest.class,
				StreamEditorTest.class,
				ArrayFillerManagerTest.class,
				ChatServerTest.class,
				DatabaseTest.class,
				DatabaseUnitTest.class,
				ColorSliderTest.class,
				SampleJettyApplicationTests.class,
				
				// extra activities
				BasicMathFunctionsTest.class,
				GetOneTest.class,
				If_SwitchTest.class,
				LetsRideTest.class,
				OwlFarmTest.class,
				OwlTest.class,
				ArrayListMethodsTest.class,
				StringTokenizerExerciseTest.class,
				StudentTest.class,
				ChatClientTest.class,
				InvoiceManagerTest.class,
				XMLCarTest.class,
				GenericsTest.class,
				HolidayTest.class,
				RegExTest.class,
				CrocodileTest.class,
				GameTest.class,
				PracticalNumbersTest.class
				// LambdaClassTest.class to test, need to recompile project with different settings */
		);
	}

	/*-
	 * Semi-automated tests for extra activities, uncomment if necessary
	 *  
	  
	  @Test public void extra8Tests() {
	  TestUtils.invokeStaticMethod("main.java.org.extra8.PracticalNumbers",
	  "main", null); }
	  
	  @Test public void extra9Tests() {
	  TestUtils.invokeStaticMethod("main.java.org.extra9.TicTacToe", "main",
	  null); }
	  
	  @Test public void extra10Tests() {
	  TestUtils.invokeStaticMethod("main.java.org.extra10.Sudoku", "main",
	  null); }
	 */
	void printStat(Class<?>... classes) {

		for (Class<?> c : classes) {
			curpack = c.getPackage().getName();
			curpack = curpack.substring(curpack.lastIndexOf('.') + 1);
			logger.debug("Curpack:" + curpack + " Class: " + c.getSimpleName());
			if (!curpack.equals(prevpack) && !"".equals(prevpack)) {
				collectEntries();
				totalTests = 0;
				passedTests = 0;
			}
			prevpack = curpack;
			// Get results from tested class
			Result result = null;
			try {
				result = JUnitCore.runClasses(c);
				int total = result.getRunCount();
				logger.debug("Total runs:" + total);
				int failed = result.getFailureCount();
				logger.debug("Failed runs:" + failed);
				int passed = total - failed;
				if (passed < 0)
					passed = 0;
				totalTests += total;
				passedTests += passed;
			} catch (Throwable t) {
				logger.error(t.toString());
			}
		}
		collectEntries();
		// Count global totals for the project
		String projectResults = "\nTotal result for exercises:\t="
				+ String.format("%.0f", passedExercises) + "/" + totalExercises;
		logger.info("\n" + exerciseNames + "\n" + exerciseResults + "\n"
				+ projectResults);

	}

	void collectEntries() {
		// count entries of previous package, if next package is started
		// or, if last class in project is achieved
		totalExercises++;
		exerciseNames = exerciseNames + prevpack + "\t";

		if (totalTests > 0) {
			exerciseResults = exerciseResults + "=" + passedTests + "/"
					+ totalTests + "\t";
			passedExercises = passedExercises + passedTests / totalTests;
		} else {
			exerciseResults = exerciseResults + "=0\t";
		}
		logger.debug("\n" + exerciseNames + "\n" + exerciseResults);
	}

}
