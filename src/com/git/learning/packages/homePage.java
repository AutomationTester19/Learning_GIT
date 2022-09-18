package com.git.learning.packages;

public class homePage {

	public boolean verifyHomePageIsDisplayed(String locator) {

		if (!locator.isBlank()) {
			return true;
		} else {
			return false;
		}

	}
}
