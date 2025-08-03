package chapter9.notion.question11;

public class Question11 {
    public static void main(String[] args) {
        String sentence = "You had me at hello.";
        String[] strArr = sentence.split(" ");
        String question11_1 = String.join("-", strArr);
        String question11_2 = String.valueOf(true);
        String question11_3 = String.valueOf(1000.0);
        boolean question11_4 = Boolean.parseBoolean("false");
        int question11_5 = Integer.parseInt("1000");
        long question11_6 = Long.parseLong("100000000000");
        double question11_7 = Double.parseDouble("1000.0");
    }
}
