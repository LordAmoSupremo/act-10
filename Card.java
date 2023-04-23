package juegocartas;

public class Card {
    private String suit;
    private String color; 
    private String value; 
    
    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    Card(String suit, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getSuit() {
        return suit;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getValue() {
        return value;
    }
    
    public String toString() {
        return suit + "," + color + "," + value;
    }
}
