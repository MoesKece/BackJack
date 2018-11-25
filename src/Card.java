public class Card {
    private Suit suit;
    private Value value;
//Constructor for the card object
    public Card(Suit suit, Value value){
        this.value = value;
        this.suit = suit;
    }
    // Returning the value
    public String toString(){
        return this.suit.toString() + "-" + this.value.toString();
    }
// get to check value
    public Value getValue(){
        return this.value;
    }
}
