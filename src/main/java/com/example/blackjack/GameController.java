package com.example.blackjack;

import java.util.List;

public class GameController {
    private Stack stack;
    private Player player = new Player();
    private Player croupier = new Player();

    public Stack.Card getCard() {
        Stack.Card card = stack.getCard();
        player.addCard(card);
        return card;
    }

    public Stack.Card getCroupier() {
        Stack.Card card = stack.getCard();
        croupier.addCard(card);
        return card;
    }

    public List<Stack.Card> getCropierList() {

    }

    public static class Player {
        private Integer score;
        private Integer multiplier = 1;

        public Player() {}

        private void addCard(Stack.Card card) {
            if (card.number == 14) {
                multiplier = 2;
            }
            score += card.number;
        }

        public Integer getScore() {
            return score * multiplier;
        }
    }

    public Status getStatus() {
        if (player.score >=)
    }

    public enum Status {
        GAME,
        YOUR_LOSE,
        YOUR_WIN;
    }
}