package Phrase;

public class phraseomatic {
    public static void main (String[] args) {
    String[] wordListOne = {"cool", "calm", "collected"};
    String[] wordListTwo = {"tough", "fire", "cold"};
    String[] wordListThree = {"boss", "king", "don"};

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength =  wordListThree.length;

    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
    System.out.println("Are you really a " + phrase);
    }
}
