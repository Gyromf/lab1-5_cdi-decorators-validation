package Lab4_Validation;

import Lab4_Validation.Model.Shop;
import Lab4_Validation.Model.XmlValidatedShop;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import java.util.Set;

public class Laboratory4 {

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .messageInterpolator(new ParameterMessageInterpolator())
                .buildValidatorFactory();
        Validator validator = factory.getValidator();

        // Пример для XmlValidatedShop
        XmlValidatedShop xmlShop = new XmlValidatedShop();
        xmlShop.setName("7-Еlеvеn");
        xmlShop.setAddress("Москва, Тверская 12");
        xmlShop.setPhoneNumber("+79850849009");
        xmlShop.setProductCount(100);

        System.out.println("Валидация XmlValidatedShop:");
        validateAndPrint(validator, xmlShop);

        // Пример для Shop с некорректными данными
        Shop shop = new Shop();
        shop.setName(null); // Некорректное название
        shop.setAddress(null); // Адрес не должен быть пустым
        shop.setPhoneNumber("-79261230967"); // Некорректный номер телефона
        shop.setProductCount(-7); // Некорректное количество товаров

        System.out.println("\nВалидация Shop:");
        validateAndPrint(validator, shop);
    }

    private static <T> void validateAndPrint(Validator validator, T object) {
        Set<ConstraintViolation<T>> violations = validator.validate(object);
        if (violations.isEmpty()) {
            System.out.println("Валидация прошла успешно!");
        } else {
            for (ConstraintViolation<T> violation : violations) {
                System.out.println(violation.getPropertyPath() + " " + violation.getMessage());
            }
        }
    }
}
