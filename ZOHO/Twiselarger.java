public class Twiselarger {
    private static int Twise(int max,int index, int a[]){
        for(int i=0 ; i<a.length ; i++){
            if(i == index)  continue;
            int sqr = 2*a[i];
            if(sqr > max){
                return -1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {3,9,1,2};
        int max = a[0] , index = 0;
        for(int i=1 ; i<a.length ; i++){
            if(max < a[i]){
                max = a[i];
                index = i;
            }
        }
        System.out.println(Twise(max , index , a));
    }
}
