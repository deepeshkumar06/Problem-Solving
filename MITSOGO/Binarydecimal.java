public class Binarydecimal {
    public static void main(String[] args) {
        int num = 400;
        while(num>0){
            int x = num, binDec = 0, place = 1;
            while(x>0){
                if(x%10 > 0){
                    binDec += place;
                }
                x /= 10;
                place *= 10;
            }
            num -= binDec;
            System.out.println("\n"+binDec);
        }
    }
    
}