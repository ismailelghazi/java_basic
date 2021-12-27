package ma.education.tp6.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface programmer {
    abstract int id() ;
    String name() default "ismail";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime date = LocalDateTime.now();

    ;
}