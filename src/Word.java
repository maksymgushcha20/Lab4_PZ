/**
 * Клас представляє слово, яке складається з масиву літер.
 */
public class Word {
    private Letter[] letters; // Масив літер, які складають слово

    /**
     * Конструктор для створення об'єкта слова.
     * @param word Рядок, який представляє слово.
     */
    public Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }

    /**
     * Видаляє всі наступні входження першої літери слова.
     * @return Оброблене слово без дублікатів першої літери.
     */
    public String removeDuplicates() {
        if (letters.length == 0) return "";

        StringBuilder result = new StringBuilder();
        result.append(letters[0].getCharacter());
        char firstLetter = Character.toLowerCase(letters[0].getCharacter());

        for (int i = 1; i < letters.length; i++) {
            char currentChar = Character.toLowerCase(letters[i].getCharacter());
            if (currentChar != firstLetter) {
                result.append(letters[i].getCharacter());
            }
        }
        return result.toString();
    }

    /**
     * Повертає слово у вигляді рядка.
     * @return Слово як рядок.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Letter letter : letters) {
            result.append(letter);
        }
        return result.toString();
    }
}
