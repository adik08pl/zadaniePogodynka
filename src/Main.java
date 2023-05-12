import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tab ={1,3,3,4,-8,4,4,3};
        System.out.println(calculate(tab));
    }

    private static String calculate(int[] tab) {
        int index = 0;
        int min=99999,max=-99999;
        int tempAmp=0;
        String answer="";
        int numer=tab.length/4;
        for(int j = 1;j<tab.length;j++) {
            for (int i = 0; i<tab.length / 4; i++) {
                if (max > tab[i + numer - 1]) {
                    max = tab[i + numer - 1];
                } else if (min < tab[i + numer - 1]) {
                    min = tab[i + numer - 1];
                }
            }
            if(tempAmp<max-min){
                tempAmp=max-min;
                index=j;
                System.out.println(" dfdsf");
            }
        }
        if(index==0) {
            answer="WINTER";
        } else if (index==1) {
            answer="SPRING";
        } else if (index==2) {
            answer="SUMMER";
        } else if (index==3) {
            answer="AUTUMN";
        }
        return answer;
    }
}