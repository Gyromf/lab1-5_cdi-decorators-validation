package Lab4_Validation.Model;



import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {

    @NotNull(message = "Название магазина не может быть пустым")
    private String name;



    @NotNull(message = "Адрес магазина не должен быть пустым")
    private String address;

    @NotNull(message = "Номер телефона магазина не должен быть пустым")
    @Pattern(regexp = "^\\+?\\d{10,15}$", message = "Номер телефона должен содержать от 10 до 15 цифр и может начинаться с +")
    private String phoneNumber;

    @Min(value = 0, message = "Количество товаров не может быть отрицательным")
    private int productCount;
}
