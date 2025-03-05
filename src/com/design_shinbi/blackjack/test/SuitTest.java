package com.design_shinbi.blackjack.test;

import org.junit.jupiter.api.Test;

import com.design_shinbi.blackjack.model.Suit;

class SuitTest {

	@Test
	void test() {
		for (Suit suit : Suit.values()) {
			System.out.println(suit.getName());
		}
	}
}