package questions.random;

public class NegativeBin {

    public static int convertBinToDecimal(String s){
        int answer = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                answer = (int) (answer + (Math.pow(-1, i) * Math.pow(2, i)));
            }
        }
        return answer;
    }

    public static int[] convertDecimalToBin(int n){
        int[] array = new int[10];
        if (n==0) return new int[]{};
        while(n!=0) {
            int maxpower = 0;
            if (n < 0) {
                maxpower = findMaxPower(n);
                if(maxpower%2 == 0){
                   array[maxpower+1] = 1;
                }
                array[maxpower] = 1;
            } else {
                maxpower = findMaxPower(n);
                if(maxpower%2 == 1){
                    array[maxpower+1] = 1;
                }
                array[maxpower] = 1;
            }
            n = Math.abs((int) (Math.abs(n) - Math.abs(Math.pow(2,maxpower))));
        }
        return array;
    }

    public static int findMaxPower(int n){
        int power = 0;
        int temp = 1;
        while(temp<Math.abs(n)){
            temp=temp*2;
            power++;
        }
        return power;
    }

}
