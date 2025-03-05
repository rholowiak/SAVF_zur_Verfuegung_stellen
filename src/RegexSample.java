import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexSample {
    public static boolean useRegex(final String input) {
        // Compile regular expression
        // Define the regex pattern for the specific formats "ZRHOLOWIAK/OL009966|ZRHOLOWIAK/OL009966H1|BDVISAVH1/SL78442|BDVISAVH1/SL79172H1|BDVISAVH1/SL78442new"
        final Pattern pattern = Pattern.compile("^[A-Za-z]{10}+/[A-Za-z]{2}+[0-9]{6}|[A-Za-z]{10}+/[A-Za-z]{2}+[0-9]{6}+[A-Za-z]{1}+[0-9]{1}|[A-Za-z]{8}+[0-9]{1}+/[A-Za-z]{2}+[0-9]{5}|[A-Za-z]{8}+[0-9]{1}+/[A-Za-z]{2}+[0-9]{5}+[A-Za-z]{1}+[0-9]{1}|[A-Za-z]{8}+[0-9]{1}+/[A-Za-z]{2}+[0-9]{5}+[A-Za-z]{3}+$", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        final Matcher matcher = pattern.matcher(input);
        // Use results...
        return matcher.matches();
    }
}