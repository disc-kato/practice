package dateArithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class executor {
    public static void main(String[] args) {
        List<String> test = new ArrayList<String>(
                Arrays.asList("2000/02/02","1950/07/05","2800/05/05","2000/03/40","2000-01-01","20001234000")
                );

        Differencer differencer = new Differencer();
        int i = 1;
        for(String check:test) {
            String result= differencer.execute(check);

            System.out.println(i++ + "回目");
            System.out.println(result+"\n");
        }
    }
}
