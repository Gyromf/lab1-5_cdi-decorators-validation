package Lab5_Annotation_Validation.Validator;

import Lab5_Annotation_Validation.Annotation.ValidProductQuantity;
import Lab5_Annotation_Validation.Model.Shop;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ProductQuantityValidator implements ConstraintValidator<ValidProductQuantity, Shop> {

    @Override
    public boolean isValid(Shop shop, ConstraintValidatorContext context) {
        return shop.getSoldProductUnits() <= shop.getDeliveredProductUnits();
    }
}
