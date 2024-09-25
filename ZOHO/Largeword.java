public class Largeword {
    public static void main(String[] args) {
        String s = "i came by car";
        int i=0, move = 0, max = 0,st = 0, end = 0;
        while(i<s.length()){
            if(s.charAt(i) == ' '){
                move = 0;
                i++;
            }
            move++;
            i++;
            if (max < move ) {
                max = move;
                st = i-max;
                end = i;
            }
        }
        if (max < move ) {
            max = move;
            st = i-max;
            end = i;
        }
        for(int j=st ; j<end ; j++){
            System.out.print(s.charAt(j));
        }
    }
}
