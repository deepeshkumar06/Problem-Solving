class Arraycompare{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int n = 3 , l = a.length;
        for(int i=0 ; i<l-(n-1) ; i++){
            int max = a[i];
            for(int j=i+1 ; j<i+n ; j++){
                if(max < a[j]){
                    max = a[j];
                }
            }
            System.out.print(max);
        }
        // for(int i : a){
        //     System.out.println(i);
        // }
    }
}