package newpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Range {
    int min() default 1;
    int max() default 20;
    int mathMin() default 48;
    int mathMax() default 57;
    int bigMin() default 65;
    int bigMax() default 90;
    int smallMin() default 87;
    int smallMax() default 113;
}
