
public class Zigzag
{
    private static String check(String s, int n){
        StringBuilder[] rows = new StringBuilder[Math.min(n , s.length())];
        for(int i = 0 ; i<rows.length ; i++){
            rows[i] = new StringBuilder();
        }
        int current = 0;
        boolean down = false;
        for(char c : s.toCharArray()){
            rows[current].append(c);
            if(current == 0 || current == rows.length-1) down = !down;
            current += down? 1: -1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder num: rows){
            res.append(num);
        }
        return res.toString();
        
    }
	public static void main(String[] args) {
        String s = "ABCDEFGHI";
        int n = 3;
        System.out.println(check(s,n));
	}
}