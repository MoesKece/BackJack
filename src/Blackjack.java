public class Blackjack {

    public static void main(String[] args) {
    //Welkom bericht
        System.out.println("Welcome to Blackjack!");

        //Create our playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();

        System.out.println(playingDeck);
    }
}
