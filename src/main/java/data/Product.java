package data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;

@Entity
@Table (name = "product")
@Getter
@Setter
@ToString

public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column (precision = 8, scale = 2)
    private BigDecimal weight;

    private String metalType;

    private String stoneType;

    @Column (precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    private String manufacturer;

    @Column (precision = 8, scale = 2)
    private BigDecimal size;
}
