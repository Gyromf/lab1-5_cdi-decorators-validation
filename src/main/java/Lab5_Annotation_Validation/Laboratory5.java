package Lab5_Annotation_Validation;

import Lab5_Annotation_Validation.Model.Shop;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

public class Laboratory5 {
    public static void main(String[] args) {
        Shop validShop = new Shop(100, 50);  // 50 sold, 100 delivered
        Shop invalidShop = new Shop(100, 150); // 150 sold, 100 delivered

        ValidatorFactory factory = Validation.byDefaultProvider()
                .configure()
                .messageInterpolator(new ParameterMessageInterpolator())
                .buildValidatorFactory();
        Validator validator = factory.getValidator();

        System.out.println("Valid shop:");
        validator.validate(validShop).forEach(violation -> System.out.println(violation.getMessage()));

        System.out.println("\nInvalid shop:");
        validator.validate(invalidShop).forEach(violation -> System.out.println(violation.getMessage()));
    }
}
