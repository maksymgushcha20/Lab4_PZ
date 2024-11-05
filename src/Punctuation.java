/**
 * Клас представляє розділовий знак.
 */
public class Punctuation {
    private char symbol; // Символ розділового знаку

    /**
     * Конструктор для створення об'єкта розділового знаку.
     * @param symbol Символ розділового знаку.
     */
    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Повертає розділовий знак у вигляді рядка.
     * @return Розділовий знак як рядок.
     */
    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
