package chapter11.notion.question32;

import java.util.*;

public class Question32 {
    public static void main(String[] args) {
        HashMap question32_1 = new HashMap();
        HashMap question32_2 = new HashMap(10);
        HashMap question32_3 = new HashMap(10, (float) 0.8);
        TreeMap treeMap = new TreeMap();
        HashMap question32_4 = new HashMap(treeMap);
        HashMap hashMap = new HashMap();
        hashMap.put(7, "손흥민"); // question32_5
        hashMap.put(1, "요리스");
        hashMap.put(9, "히샬리송");
        hashMap.put(10, "케인");
        hashMap.put(13, "비카리오");
        boolean question32_6 = hashMap.containsKey(7);
        boolean question32_7 = hashMap.containsValue("손흥민");
        String question32_8 = (String) hashMap.get(7);
        boolean question32_9 = hashMap.isEmpty();
        Set question32_10 = hashMap.entrySet();
        Set question32_11 = hashMap.keySet();
        Collection question32_12 = hashMap.values();
        HashMap otherMembers = new HashMap();
        otherMembers.put(17, "로메로");
        otherMembers.put(38, "우도기");
        hashMap.putAll(otherMembers);// question32_13
        hashMap.remove(1);
        hashMap.replace(10, "매디슨");
        int question32_16 = hashMap.size();
        hashMap.clear();
    }
}
