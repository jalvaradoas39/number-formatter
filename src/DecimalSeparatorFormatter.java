import java.text.NumberFormat;
/**
 * Description: This class implements the NumberFormatter interface and formats an integer with decimal separators.
 */
public class DecimalSeparatorFormatter implements NumberFormatter {
    /**
     * Formats the given integer with decimal separators.
     * @param n the integer to format
     * @return the formatted string representation with decimal separators
     */
    @Override
    public String format(int n) {
        return NumberFormat.getInstance().format(n);
    }
}
