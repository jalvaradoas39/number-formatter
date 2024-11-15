/**
 * Description: This class implements the NumberFormatter interface and formats negative numbers with parentheses.
 */
public class AccountingFormatter implements NumberFormatter {

    /**
     * @param n the integer to format
     * @return the formatted string representation in accounting style
     */
    @Override
    public String format(int n) {
        if (n < 0) {
            return "(" + Math.abs(n) + ")";
        } else {
            return Integer.toString(n);
        }
    }
}
