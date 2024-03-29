/**
 * Liz Hinton
 * CIS175 - Fall 2023
 * Jan 18, 2024
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testRunner {
	public static void main(String[] args) {
		Result result =
				JUnitCore.runClasses(testHero.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}