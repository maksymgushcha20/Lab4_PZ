import java.util.ArrayList;
import java.util.List;

/**
 * Клас представляє речення, яке складається з масиву слів і розділових знаків.
 */
public class Sentence {
    private List<Object> elements; // Список, що містить слова та розділові знаки

    /**
     * Конструктор для створення об'єкта речення.
     * @param sentence Рядок, який представляє речення.
     */
    public Sentence(String sentence) {
        elements = new ArrayList<>();
        String[] parts = sentence.split("(?=\\p{Punct})|\\s+");

        for (String part : parts) {
            if (part.matches("\\p{Punct}")) {
                elements.add(new Punctuation(part.charAt(0)));
            } else if (!part.isBlank()) {
                elements.add(new Word(part));
            }
        }
    }

    /**
     * Обробляє речення, видаляючи дублікати першої літери в кожному слові.
     * @return Оброблене речення у вигляді рядка.
     */
    public String processSentence() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < elements.size(); i++) {
            Object element = elements.get(i);

            if (element instanceof Word) {
                result.append(((Word) element).removeDuplicates());
            } else if (element instanceof Punctuation) {
                result.append(element);
            }

            if (i + 1 < elements.size() && elements.get(i) instanceof Word && !(elements.get(i + 1) instanceof Punctuation)) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    /**
     * Повертає речення у вигляді рядка.
     * @return Речення як рядок.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object element : elements) {
            result.append(element.toString());
        }
        return result.toString();
    }
}
