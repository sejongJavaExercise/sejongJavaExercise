package chapter12.notion.question22;

public class Question22 { public static void main(String[] args) {} }

@interface AnnotationOfQuestion22_1{
    int count() default 0;
    String date();
}
@interface AnnotationOfQuestion22_2{
    String value();
}

@AnnotationOfQuestion22_1(date="20240111")
class ClassOfQuestion22{}
