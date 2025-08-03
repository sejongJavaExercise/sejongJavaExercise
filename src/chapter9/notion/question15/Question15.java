package chapter9.notion.question15;

public class Question15 {
    public static void main(String[] args) {
        StringBuffer question15_1 = new StringBuffer();
        StringBuffer question15_2 = new StringBuffer(20);
        StringBuffer question15_3 = new StringBuffer("abcdef");
        String dreamsCome = "Dreams come ";
        StringBuffer question15_4 = new StringBuffer(dreamsCome).append(true);
        String abcde = "abcde";
        char[] mnopqr = {'m','n','o','p','q','r'};
        StringBuffer question15_5 = new StringBuffer(abcde).append('f').append("ghijkl").append(mnopqr).append(123);
        StringBuffer abcdef = new StringBuffer("abcdef");
        int question15_6 = abcdef.capacity();
        char question15_7 = abcdef.charAt(2);
        abcdef.delete(2,4);
        abcdef.deleteCharAt(1);
        abcdef.insert(1, 'b');
        abcdef.insert(2, "cd");
        abcdef.insert(6, 123);
        int question15_13 = abcdef.length();
        abcdef.replace(6, 9, "ABC");
        abcdef.reverse();
        abcdef.setCharAt(2,'a');
        abcdef.setLength(20);
        String question15_18 = abcdef.toString();
        String question15_19 = abcdef.substring(2);
        String question15_20 = abcdef.substring(0, 2);
    }
}
