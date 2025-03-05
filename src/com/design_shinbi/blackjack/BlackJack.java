package com.design_shinbi.blackjack;

import java.util.Scanner;

import com.design_shinbi.blackjack.model.Attender;
import com.design_shinbi.blackjack.model.Dealer;
import com.design_shinbi.blackjack.model.Player;
import com.design_shinbi.blackjack.model.Stock;

public class BlackJack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		start(scanner);
		
		scanner.close();
	}
	
	public static void start(Scanner scanner) {
		Player player = new Player(scanner);
		Dealer dealer = new Dealer();
		Stock stock = new Stock();
		
		player.start(stock);
		dealer.start(stock);
		dealer.display();
		player.play(stock);
		dealer.play(stock);
		
		showResult(player, dealer);
	}
	
	public static void showResult(Attender player, Attender dealer) {
		dealer.display();
		player.display();
		dealer.calculateStrength();
		player.calculateStrength();
		
		if(dealer.calculateStrength() < player.calculateStrength()) {
			System.out.println("あなたの勝ちです！！！");
		}
		else if (dealer.calculateStrength() == player.calculateStrength()){
			System.out.println("引き分けです。");
		}
		else {
			System.out.println("あなたの負けです。");
		}
	}
}