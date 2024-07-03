import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*Pattern: ^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$
(0[1-9]|[12][0-9]|3[01]): Ngày từ 01 đến 31.
(0[1-9]|1[0-2]): Tháng từ 01 đến 12.
([0-9]{4}): Năm bao gồm 4 chữ số.
*/
    public class DateValidator {
        public static void main(String[] args) {
            String datePattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";
            Pattern pattern = Pattern.compile(datePattern);
            String[] dates = {"01/01/2024", "01/13/2024"};

            for (String date : dates) {
                Matcher matcher = pattern.matcher(date);
                if (matcher.matches()) {
                    System.out.println(date + " là định dạng ngày hợp lệ.");
                } else {
                    System.out.println(date + " là định dạng ngày không hợp lệ.");
                }
            }
        }
    }

