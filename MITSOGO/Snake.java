public class Snake {
    public static void main(String[] args) {
        int i=0 , n = 3 ;
        for(int j=0 ; j<n ; j++){
            if(j%2==0){
                int l = i;
                for(int k=0+l ; k<n+l ; k++){
                    System.out.print(k+1);
                    i++;
                }
                System.out.println();
        }    
            else{
                int l = i;
                for(int k=l+n ; k>l ; k--){
                    System.out.print(k);
                    i++;
                }
                System.out.println();
            }
        }
    }
}
