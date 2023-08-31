import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) {
        String[] words = {"act", "cat", "dog", "god", "tac"};

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!anagrams.containsKey(sortedWord)) {
                anagrams.put(sortedWord, new ArrayList<>());
            }

            anagrams.get(sortedWord).add(word);
        }

        for (List<String> anagramGroup : anagrams.values()) {
            if (anagramGroup.size() > 1) {
                System.out.println(anagramGroup);
            }
        }
    }
}