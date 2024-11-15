/**
 * Description: This interface provides a method for formatting an integer. It is intended to be implemented by different classes providing specific formatting styles.
 */
public interface NumberFormatter {
    /**
     * Formats the given integer as a string.
     * @param n the integer to format
     * @return the formatted string representation of the integer
     */
    String format(int n);
}
