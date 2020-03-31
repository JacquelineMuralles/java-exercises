import java.util.Random;

public class ServerNameGenerator {
    //TODO: Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = new String[] {"ugly", "pretty", "petty", "loving", "kind", "vengeful", "flaky", "shrill", "lively", "friendly"};

    public static String[] nouns = new String[] {"Greece", "puppy", "baby", "photograph", "creature", "Siberia", "gift", "home", "luggage", "book"};

    //TODO: Create a method that will return a random element from an array of strings.
    public static String getWord(String[] choices){
        Random random = new Random();
        String randomWord = choices[random.nextInt(choices.length)];
        return randomWord;
    }


    //TODO: Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    public static void main(String[] args) {
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }
}
