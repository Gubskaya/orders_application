package application.orders2.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Setter
@Getter
public class OrderDTO {
    private String citySender;
    private String addressSender;
    private String cityRecipient;
    private String addressRecipient;
    private Double weight;
    private LocalDate pickupDate;
}
