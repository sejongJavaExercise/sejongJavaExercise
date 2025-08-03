package chapter9.notion.question22;

public class Question22 {
    public static void main(String[] args) {
        Integer x = new Integer(100);
        Integer y = new Integer(100);
        Double z = new Double(0.1);
        Long l = new Long(10000000000L);
        String hundred = "100";
        String tenBillion = "10000000000";
        String pi = "3.14";

        boolean question22_1 = x.equals(y);
        int question22_2 = x.compareTo(y);
        String question22_3 = x.toString();
        int question22_4 = Integer.MAX_VALUE;
        int question22_5 = Integer.MIN_VALUE;
        int question22_6 = Integer.SIZE;
        int question22_7 = Integer.BYTES;
        Class question22_8 = Integer.TYPE;
        int question22_9 = x.intValue();
        double question22_10 = z.doubleValue();
        Long question22_11 = l.longValue();
        int question22_12 = Integer.parseInt(hundred);
        int question22_13 = Integer.parseInt(hundred, 16);
        Integer question22_14 = Integer.valueOf(hundred);
        Integer question22_15 = Integer.valueOf(hundred, 16);
        long question22_16 = Long.parseLong(tenBillion);
        Long question22_17 = Long.valueOf(tenBillion);
        Long question22_18 = Long.valueOf(tenBillion, 16);
        double question22_19 = Double.parseDouble(pi);
        Double question22_20 = Double.valueOf(pi);
    }
}
