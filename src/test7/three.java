package test7;

// 读入一个字符串(String), 然后判断这个这个字符串是否是回文串
// abcba => true  abc => false abba => true
public class three {
    public static boolean palindrome(String str,int l, int r){
        if(l >= r){
            return true;
        }
        if(str.charAt(l)==str.charAt(r)){
            return palindrome(str, ++l, --r);
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        String str = "abvsba";
        System.out.print(palindrome(str,0,str.length()-1));
    }
}
