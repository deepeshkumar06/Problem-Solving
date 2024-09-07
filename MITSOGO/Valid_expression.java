// import java.util.Stack;

public class Valid_expression {
    public static int check(String s){
        int max = 0,count = 0, cr = 0;
        for(char i : s.toCharArray()){
            if(i >= 'a' && i<='z' || i >= 'A' && i<='Z')
                cr++;
                // System.out.println(i);
            if(i == '('){
                count++;
            }
            if(i == ')'){
                if(cr > 0)
                    max = Math.max(count, max);
                if(count < 0)
                    // System.out.println("-1");
                    return -1;
                count--;
                if(cr > 0)
                    cr--;
            }
            
                }
        if (count == 0) {
            return max;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        String s = "((a)(b)(()))";
        System.out.println(check(s));

    }
}
