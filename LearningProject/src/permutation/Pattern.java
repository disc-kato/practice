package permutation;

import java.util.stream.IntStream;

public class Pattern {
    public static void main (String[] args) {
        Pattern p = new Pattern();
        p.calculation("for文");
        p.calculation("while文");
        p.calculation("do-while文");
        p.calculation("拡張for文");
        p.calculation("IntStream");
    }
    public void calculation(String pattern){
        int sum = 0;

        switch(pattern){
            case "for文":
                for(int i = 1; i<=100; i++) {
                    sum += i;
                }
                break;

            case "while文":
                int i =1;
                while(i<=100){
                    sum += i++;
                }
                break;

            case "do-while文":
                int j = 1;
                do {
                    sum += j++;
                }while(j<=100);
                break;

            case "拡張for文":
                int[] g = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                        21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
                        41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
                        61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,
                        81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
                for(int h : g) {
                    sum += h;
                }
                break;

            case "IntStream":
                IntStream stream = IntStream.range(1, 101);
                sum = stream.sum();
                break;

        }
        System.out.println("■計算方法:" + pattern + "\n" + "　判定：" + (sum==5050) +  "　合計：" + sum + "\n" );
    }
}
