public class Labexercise2a {

    public static void main(String[] args) {
        String s1 = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative";

        // Using String methods
        char firstChar = s1.charAt(0);
        System.out.println("First character: " + firstChar);

        String comparisonText = "Another string for comparison";
        int compareToResult = s1.compareTo(comparisonText);
        System.out.println("Comparison result: " + compareToResult);

        String concatenatedText = s1.concat(" This is additional information.");
        System.out.println("Concatenated text: " + concatenatedText);

        boolean containsBombay = s1.contains("Bombay");
        System.out.println("Contains 'Bombay': " + containsBombay);

        boolean endsWithAlternative = s1.endsWith("alternative");
        System.out.println("Ends with 'alternative': " + endsWithAlternative);

        boolean equalsComparisonText = s1.equals(comparisonText);
        System.out.println("Equals comparison result: " + equalsComparisonText);

        boolean equalsIgnoreCaseComparisonText = s1.equalsIgnoreCase(comparisonText);
        System.out.println("EqualsIgnoreCase comparison result: " + equalsIgnoreCaseComparisonText);

        String formattedText = String.format("Formatted text: %s - %d words", s1, s1.split("\\s+").length);
        System.out.println(formattedText);

        byte[] bytes = s1.getBytes();
        System.out.println("Bytes length: " + bytes.length);

        char[] chars = new char[50];
        s1.getChars(10, 60, chars, 0);
        System.out.println("Chars: " + new String(chars));

        int indexOfRain = s1.indexOf("rain");
        System.out.println("Index of 'rain': " + indexOfRain);

        String internedText = s1.intern();
        System.out.println("Interned text: " + internedText);

        boolean isEmpty = s1.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        String[] words = s1.split("\\s+");
        String joinedText = String.join("-", words);
        System.out.println("Joined text: " + joinedText);

        int lastIndexOfRain =s1.lastIndexOf("rain");
        System.out.println("Last index of 'rain': " + lastIndexOfRain);

        int textLength = s1.length();
        System.out.println("Text length: " + textLength);

        String replacedText = s1.replace("thriving", "struggling");
        System.out.println("Replaced text: " + replacedText);

        String regexReplacedText = s1.replaceAll("\\s+", "_");
        System.out.println("Regex replaced text: " + regexReplacedText);

        String[] splitText = s1.split("\\.");
        System.out.println("Split text: ");
        for (String sentence : splitText) {
            System.out.println(sentence.trim());
        }

        boolean startsWithWe = s1.startsWith("We");
        System.out.println("Starts with 'We': " + startsWithWe);

        String substringText = s1.substring(50, 100);
        System.out.println("Substring text: " + substringText);

        char[] charArray = s1.toCharArray();
        System.out.println("To char array length: " + charArray.length);

        String lowercaseText = s1.toLowerCase();
        System.out.println("Lowercase text: " + lowercaseText);

        String uppercaseText = s1.toUpperCase();
        System.out.println("Uppercase text: " + uppercaseText);

        String trimmedText = s1.trim();
        System.out.println("Trimmed text: " + trimmedText);

        String valueOfLength = String.valueOf(textLength);
        System.out.println("Value of text length: " + valueOfLength);
    }
}
