package Lab5_Annotation_Validation.Annotation;

import Lab5_Annotation_Validation.Validator.ProductQuantityValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ProductQuantityValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidProductQuantity {
    String message() default "Количество проданных единиц не может превышать количество поставленных единиц.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
