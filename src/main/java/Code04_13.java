public class Code04_13 {
    public static void main(String[] args){
        String str = "    한글   ABCD   efgh    ";
        String cutStr = "";
        String upper;
        String lower;
        String all;

        upper = str.toUpperCase();
        lower = str.toLowerCase();
        cutStr = str.trim();
        all = str.replaceAll(" ", "");

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("대문자 ==> [" + upper + "]");
        System.out.println("소문자 ==> [" + lower + "]");
        System.out.println("공백 제거 ==> [" + cutStr + "]");
        System.out.println("모든 공백 제거 ==> [" + all + "]");
    }
}
