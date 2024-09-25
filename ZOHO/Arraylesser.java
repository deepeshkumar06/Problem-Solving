class Arraylesser {
    public static void main(String[] args) {
        int a[] = {1, 5, 3, 6, 8};
        int n = a.length;
        for(int i=0 ; i<n ; i++){
            int min = -1;
            for(int j=i+1 ; j<n ; j++){
                if(a[i] < a[j]){
                if(min == -1 || min > a[j])
                    min = a[j];
                }
            }
            a[i] = min;
        }
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}
