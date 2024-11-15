/**
 * Description: This class implements the NumberFormatter interface and formats an integer in the usual way without any modifications.
 */
public class DefaultFormatter implements NumberFormatter {
    /**
     * Formats the given integer as a string.
     * @param n the integer to format
     * @return the string representation of the integer
     */
    @Override
    public String format(int n) {
        return Integer.toString(n);
    }
}
