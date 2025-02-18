package Lab5_Annotation_Validation.Model;

import Lab5_Annotation_Validation.Annotation.ValidProductQuantity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ValidProductQuantity
public class Shop {
    private int deliveredProductUnits;
    private int soldProductUnits;
}
