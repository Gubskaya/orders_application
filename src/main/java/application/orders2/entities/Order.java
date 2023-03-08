package application.orders2.entities;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_sender", nullable = false)
    private String citySender;

    @Column(name = "address_sender", nullable = false)
    private String addressSender;

    @Column(name = "city_recipient", nullable = false)
    private String cityRecipient;

    @Column(name = "address_recipient", nullable = false)
    private String addressRecipient;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "pickup_date", nullable = false)
    private LocalDate pickupDate;

}
