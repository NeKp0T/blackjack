package com.example.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Card> list = new ArrayList<>();

    public Card getCard() {
        Integer index =
    }

    public static class Card {
        public Integer number;
        public Suit suit;

        public Card(Integer number, Suit suit) {
            this.number = number;
            this.suit = suit;
        }

        @Override
        public String toString() {
            return number + " " + suit;
        }
    }

    public enum Suit {
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS;
    }
}
