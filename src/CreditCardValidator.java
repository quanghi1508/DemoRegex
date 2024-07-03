import java.util.regex.Pattern;
import java.util.regex.Matcher;
/* Pattern: ^(\d{4}[-\s]?){3}\d{4}$
(\d{4}[-\s]?){3}\d{4}: Nhóm 4 chữ số, lặp lại 3 lần với dấu gạch ngang hoặc khoảng trắng tùy chọn, sau đó là 4 chữ số cuối.
 */
public class CreditCardValidator {
    public static void main(String[] args) {
        String creditCardPattern = "^(\\d{4}[-\\s]?){3}\\d{4}$";
        Pattern pattern = Pattern.compile(creditCardPattern);
        String[] creditCards = {"1234-5678-9876-5432", "1234 5678 9876 5432", "1234567898765432"};

        for (String card : creditCards) {
            Matcher matcher = pattern.matcher(card);
            if (matcher.matches()) {
                System.out.println(card + " là số thẻ tín dụng hợp lệ.");
            } else {
                System.out.println(card + " là số thẻ tín dụng không hợp lệ.");
            }
        }
    }
}
