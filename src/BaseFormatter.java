/**
 * Description: This class implements the NumberFormatter interface and formats an integer in a specified base.
 * The base can be any number between 2 and 36, provided through the constructor.
 */
public class BaseFormatter implements NumberFormatter {
    private final int base;
    /**
     * Constructs a BaseFormatter with the given base.
     * @param base the base in which to format the number (must be between 2 and 36)
     * @throws IllegalArgumentException if the base is not between 2 and 36
     */
    public BaseFormatter(int base) {
        if (base < 2 || base > 36) {
            throw new IllegalArgumentException("Base must be between 2 and 36.");
        }
        this.base = base;
    }

    /**
     * Formats the given integer in the specified base.
     * @param n the integer to format
     * @return the string representation of the integer in the specified base
     */
    @Override
    public String format(int n) {
        return Integer.toString(n, base);
    }
}
