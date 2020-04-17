package dateArithmetic;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class Differencer {
    public String execute(String imports) {
        String result = null;

        try {
            //引数がYYYY/MM/DDだった場合、現在日付との差を表示する（年前、年後）
            if(imports.length() == 10){
                String strDate = imports.replace("-", "/");
                DateFormat format = DateFormat.getDateInstance();
                format.setLenient(false);
                format.parse(strDate);
                String date = strDate.replace("/", "-");

                Period period = Period.between((LocalDate)LocalDate.now(), LocalDate.parse(date));

                String target = LocalDate.parse(date).getYear() + "年" + LocalDate.parse(date).getMonthValue() + "月" + LocalDate.parse(date).getDayOfMonth() + "日";
                String today = LocalDate.now().getYear() + "年" + LocalDate.now().getMonthValue() + "月" + LocalDate.now().getDayOfMonth() + "日";
                result = "指定日付:　" + target +"\n現在:　" + today +  "\n差分:　" + period.getYears() + "年と" + period.getMonths() + "月と" + period.getDays() + "日";

            }else if(imports.length() == 8){
                result = "時間に関するロジックは未完成です";

            }else {
                result = "不正なフォーマットです";

            }
        }catch (ParseException e) {
            result = "存在しない日付であるか、不正なフォーマットです。";
        }catch (IllegalArgumentException e) {
            result = "引数の文字列は不正です";
        }
        return result;
    }
}
