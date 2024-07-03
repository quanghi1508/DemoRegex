import java.util.regex.Pattern;
import java.util.regex.Matcher;
/* Pattern: ^([01][0-9]|2[0-3]):([0-5][0-9])$
([01][0-9]|2[0-3]): Giờ từ 00 đến 23.
([0-5][0-9]): Phút từ 00 đến 59.
 */
public class TimeValidator {
    public static void main(String[] args) {
        String timePattern = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$";
        Pattern pattern = Pattern.compile(timePattern);
        String[] times = {"00:00","12:60"};

        for (String time : times) {
            Matcher matcher = pattern.matcher(time);
            if (matcher.matches()) {
                System.out.println(time + " là định dạng giờ hợp lệ.");
            } else {
                System.out.println(time + " là định dạng giờ không hợp lệ.");
            }
        }
    }
}
