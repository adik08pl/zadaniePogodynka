public class Main {
    public static void main(String[] args) {
        int[] tab ={4,12,-4,2,4,7,3,-5,6,5,-8,16};
        System.out.println(calculate(tab));
    }

    private static String calculate(int[] tab) {
        int index = 5;
        int min=99999,max=-99999;
        int tempAmp=0;
        String answer;
        int numer=tab.length/4;
        for(int j = 0;j<4;j++) {
            for (int i = 0; i<numer; i++) {
                if (max < tab[i + numer*j]) {
                    max = tab[i + numer*j];
                }if (min > tab[i + numer*j]) {
                    min = tab[i + numer*j];
                }
            }
            if(tempAmp<max-min){
                tempAmp=max-min;
                index=j;
            }
            max=-99999;
            min=99999;
        }
        if(index==0) {
            answer="WINTER";
        } else if (index==1) {
            answer="SPRING";
        } else if (index==2) {
            answer="SUMMER";
        } else if (index==3) {
            answer="AUTUMN";
        } else{
            answer="ERROR";
        }
        return answer;
    }
}