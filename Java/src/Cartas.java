public class Cartas {
    public static void main (String[] args) {

        String[] SUITS = {
            "Ouros", "Paus", "Copas", "Epadas"
        }; 
        
        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Valete", "Dama", "Rei", "Ás"

        };
        String[] DECK ;
        DECK = new String[RANKS.length * SUITS.length];
        for (int i = 0; i < DECK.length; i++){
            DECK[i] = RANKS[i % 13] + " " + SUITS[i / 13]; 
            System.out.println(DECK[i]); 
        }
    }
}