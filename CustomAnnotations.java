import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}
//gfghjkuio


class CustomAnnotations{
    @MyAnnotation(value = "Custom Annotation Applied")
    public void myMethod() {
        System.out.println("Inside myMethod");
    }

    public static void main(String[] args) {
        CustomAnnotations ca = new CustomAnnotations();
        ca.myMethod();
    }
    //really the way to tell the compiler to use this annotation
    
}