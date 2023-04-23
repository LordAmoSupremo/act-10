package juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        String color;
        String[] suits = {"treboles", "corazones", "picas", "diamantes"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : suits) {
            if (suit.equals("treboles") || suit.equals("picas")) {
                color = "negro";
            } else {
                color = "rojo";
            }
            for (String value : values) {
                Card card = new Card(suit, color, value);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public Card head() throws Exception {
        if (cards.isEmpty()) {
            throw new Exception("Se han agotado las cartas");
        }

        Card card = cards.get(0);
        System.out.println(" ");
        System.out.println("La primera carta del deck es:  ");
        cards.remove(0);
        System.out.println(card.toString());

        if (cards.isEmpty()) {
            throw new Exception("Se han agotado las cartas");
        }
        System.out.println("La siguiente carta es: ");
        System.out.println(cards.get(0).toString());
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return card;

    }

    public Card pick() throws Exception {
        if (cards.isEmpty()) {
            throw new Exception("Se han agotado las cartas");
        }

        System.out.println(" ");
        System.out.println("La carta que te salió fue: ");
        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());
        Card card = cards.get(randomIndex);
        cards.remove(randomIndex);
        System.out.println(card.toString());
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return card;

    }

    public ArrayList<Card> hand() throws Exception {
        if (cards.size() < 5) {
            throw new Exception("No hay suficientes cartas para generar una mano");
        }

        ArrayList<Card> hand = new ArrayList<Card>();
        System.out.println(" ");
        System.out.println("Estas son tus cartas: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            System.out.println("Tu carta número " + (i + 1) + " es: ");
            Card card = pick();
            hand.add(card);
        }
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return hand;

    }
}
