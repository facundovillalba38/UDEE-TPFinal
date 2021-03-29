package ApiRest.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ElectricMeter {

    private String id_serial;
    private String brand;
    private String model;

}
