import java.lang.Math;

class Dice {
    int noOfDices;

    public Dice(int noOfDices) {
        this.noOfDices = noOfDices;
    }

    public int rollDice() {
        return (int) (Math.random() * (6 * noOfDices - noOfDices + 1)) + 1;
    }
}
