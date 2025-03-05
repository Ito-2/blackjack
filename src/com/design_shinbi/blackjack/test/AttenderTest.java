package com.design_shinbi.blackjack.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.design_shinbi.blackjack.model.Attender;
import com.design_shinbi.blackjack.model.Card;
import com.design_shinbi.blackjack.model.Suit;

class AttenderTest {

	@Test
	void test() {
		List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.SPADE, 7));
        cards.add(new Card(Suit.HEART, 1));
        cards.add(new Card(Suit.DIAMOND, 12));
        cards.add(new Card(Suit.CLUB, 1));
        cards.add(new Card(Suit.DIAMOND, 13));
       
        int[] strengthArray = {18, 18, 19, 0};
       
        for(int i = 2; i <= cards.size(); i++) {
            List<Card> subList = cards.subList(0, i);
            int strength = Attender.calculateStrengthFromList(subList);
           
            System.out.println("Cards: " + subList);
            System.out.println("Strength: " + strength);
           
            if(strength != strengthArray[i - 2]) {
                fail("値が違います。");
            }
        }
	}
}