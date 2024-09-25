public class Nearestele {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10,12,14,16,18,20};
        int num = 15;
        for(int i=0 ; i<a.length ; i++){
            if(a[i] == num){
                System.out.println(a[i]);
                break;
            }
            else if(a[i] > num){
                System.out.println(a[i-1]);
                break;
            }
        }
    }
}
