package io.javabrains;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Running Tests for MathUtils")
class MathUtilsTest {

	MathUtils obj;
	/*
	 * TestInfo & TestReporter are Java Interfaces that JUnit injects as dependency
	 * TestInfo helps provide details of the class, method, metadata like tags, names
	 * TestReporter helps us update msgs in the Junit output
	 */
	TestInfo testinfo;
	TestReporter testReporter;

	/*
	 * @BeforeAll void setup() { System.out.println("Before All"); }
	 */

	/*
	 * @BeforeAll static void setup() { System.out.println("Before All"); }
	 */
	@BeforeEach
	void init(TestInfo testinfo,TestReporter testReporter) {
		this.testinfo = testinfo;
		this.testReporter = testReporter;
		obj = new MathUtils();
		testReporter.publishEntry("Running "+ testinfo.getDisplayName()+" with tags "+testinfo.getTags());
	}

	/*
	 * @AfterEach void cleanup() { System.out.println("Cleaning up"); }
	 */

	@Test
	@DisplayName("Testing Multiply Method")
	@Tag("Math")
	void testMultiple() {
		//System.out.println("Running "+ testinfo.getDisplayName()+" with tags "+testinfo.getTags());
		
		// assertEquals(4, obj.multiply(2, 2), "Should return the right product");
		// And condition for all your asserts
		assertAll(() -> assertEquals(4, obj.multiply(2, 2)), () -> assertEquals(0, obj.multiply(2, 0)),
				() -> assertEquals(-2, obj.multiply(-2, 1)));
	}

	@Nested
	@DisplayName("Tests for Add Method")
	@Tag("Math")
	class AddTest {

		@Test
		@DisplayName("When adding +ve numbers")
		void testAddPositive() {
			assertEquals(5, obj.add(2, 3), "should return the right sum");
		}

		@Test
		@DisplayName("When adding -ve numbers")
		void testAddNegative() {
			assertEquals(-5, obj.add(-2, -3), ()->"should return the right sum");
		}
	}

	/*
	 * Repeated test takes no of repetition  as arg
	 * If one of the repetition fails the test fails.
	 */
	@RepeatedTest(3)
	@Tag("circle")
	void testComputeCircleArea(RepetitionInfo rep) {
		double actual = obj.computeCircleArea(10);
		double expected = 314.1592653589793;
		/*
		 * if(rep.getCurrentRepetition()==2) { expected = 23; }
		 */
		
		assertEquals(expected, actual, "This methods return circle's area");
	}

	@Test
	@Tag("Math")
	// @EnabledOnOs(OS.LINUX)
	void testDivide() {
		boolean isServerUp = false;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class, () -> obj.divide(10, 0), "Divide by 0");
	}

	@Test
	@Disabled
	@Tag("Math")
	@DisplayName("Disabled Method")
	void testDisabled() {
		fail("This method has to fail");
	}
}
