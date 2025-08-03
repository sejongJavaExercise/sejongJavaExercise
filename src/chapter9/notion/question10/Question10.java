package chapter9.notion.question10;

public class Question10 {
    public static void main(String[] args) {
        String abcdef = "abcdef";
        String question10_1 = new String("abcdef");
        char[] arr = {'a','b','c','d','e','f'};
        String question10_2 = new String(arr);
        StringBuffer stringBuffer = new StringBuffer("abcdef");
        String question10_3 = new String(stringBuffer);
        char question10_4 = abcdef.charAt(3);
        int question10_5 = abcdef.compareTo("aaaaaa");
        String question10_6 = abcdef.concat("ghijkl");
        boolean question10_7 = abcdef.contains("abc");
        boolean question10_8 = abcdef.endsWith("ef");
        boolean question10_9 = abcdef.equals("fedcba");
        boolean question10_10 = abcdef.equalsIgnoreCase("ABCDEF");
        int question10_11 = abcdef.indexOf('d');
        int question10_12 = abcdef.indexOf('d',2);
        int question10_13 = abcdef.indexOf("de");
        int question10_14 = abcdef.lastIndexOf('d');
        int question10_15= abcdef.lastIndexOf("de");
        int question10_16 = abcdef.length();
        String aabbaabb = "aabbaabb";
        String question10_17 = abcdef.replace('b', 'a');
        String question10_18 = abcdef.replace("bb", "BB");
        String question10_19 = abcdef.replaceFirst("bb", "BB");
        String sentence = "You had me at hello.";
        String[] question10_20 = sentence.split(" ");
        String[] question10_21 = sentence.split(" ", 3);
        boolean question10_22 = abcdef.startsWith("ab");
        String question10_23 = abcdef.substring(2);
        String question10_24 = abcdef.substring(1, 4);
        String ABCDEF = "ABCDEF";
        String question10_25 = ABCDEF.toLowerCase();
        String question10_26 = abcdef.toUpperCase();
        String question10_27 = abcdef.toString();
        String abcdefWithSpaces = "  abc def ";
        String question10_28 = abcdefWithSpaces.trim();
        String question10_29 = String.valueOf(1000);
        String question10_30 = String.valueOf('a');
    }
}
