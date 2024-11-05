/**
 * Клас представляє текст, який складається з масиву речень.
 */
public class Text {
    private Sentence[] sentences; // Масив речень

    /**
     * Конструктор для створення об'єкта тексту.
     * @param text Рядок, який представляє весь текст.
     */
    public Text(String text) {
        String[] sentenceParts = text.split("(?<=[.!?])\\s+");
        sentences = new Sentence[sentenceParts.length];

        for (int i = 0; i < sentenceParts.length; i++) {
            sentences[i] = new Sentence(sentenceParts[i]);
        }
    }

    /**
     * Обробляє текст, видаляючи дублікати першої літери у словах кожного речення.
     * @return Оброблений текст у вигляді рядка.
     */
    public String processText() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            result.append(sentence.processSentence()).append(" ");
        }
        return result.toString().trim();
    }

    /**
     * Повертає текст у вигляді рядка.
     * @return Текст як рядок.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            result.append(sentence).append(" ");
        }
        return result.toString().trim();
    }
}
