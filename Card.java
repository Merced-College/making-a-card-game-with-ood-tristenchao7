// Tristen Chao
//Teammates: Dylan and Shane
// 9/23/2025
//Making a Card Game with OOD
public class Card {
    //data variables
    private String cardSuit;
    private String cardName;
    private int cardValue;
    private String cardPicture;
    //constructor
    public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
        this.cardSuit = cardSuit;
        this.cardName = cardName;
        this.cardValue = cardValue;
        this.cardPicture = cardPicture;
    }

    public Card () {
        cardSuit = "";
        cardName = "";
        cardValue = 0;
        cardPicture = "";
    }   
    //return
    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardName() {
        return cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getCardPicture() {
        return cardPicture;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card other = (Card) obj;
        return cardName.equals(other.cardName);
    }
    //Override and toString
    @Override
    public String toString() {
        return cardName + " of " + cardSuit;
    }
    
}

