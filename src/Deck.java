import java.util.ArrayList;
import java.util.Random;

public class Deck {
    //instance vars
    private ArrayList<Card> cards;
    //constructor
    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public void createFullDeck(){
        //Generate Cards
        for(Suit cardSuit : Suit.values()){
            for(Value cardValue : Value.values()){
            // Add a new card to the mix
                this.cards.add(new Card(cardSuit,cardValue));

            }
        }

    }
    //shuffle deck of cards
    public void shuffle(){
        ArrayList<Card>tmpDeck = new ArrayList<Card>();
        //Random Object
        Random random = new Random();
        int randomCardIndex = 0;
        int orginalSize = this.card.size();

    }
    public String toString(){
        String cardListOutput = "";
        int i = 0;
        for(Card aCard : this.cards) {
            cardListOutput += "\n" + i + "-" + aCard.toString();
            i++;
        }
        return cardListOutput;
    }

}
