public class Median {
    public static void main(String[] args) {
        int a[] = {1,2,3,5};
        int b[] = {4,6,8,10,9,10,11,12};
        int i=0 , j=0; 
        while (i<a.length && j<b.length) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i++;j++;
            }
            else i++;
        }
        int tot = (a.length+b.length);
        int mid = tot/2;
        int ans = 0;
        if(tot%2 == 0){
            if(mid > a.length)
                ans = b[mid-a.length]+b[mid+1-a.length];
            if(mid<a.length && mid+1>a.length){
                ans = a[mid]+b[mid-a.length];
            }
            if(mid<a.length && mid+1 <a.length)
            ans = a[mid]+a[mid+1];
        }
        else{
        if(mid > a.length){
            ans = b[mid-a.length];
        }
        else
            ans = a[mid]/2;
        }
        System.out.println(ans/2); //9
    }
}
