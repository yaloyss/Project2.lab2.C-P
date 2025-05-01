package data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Entity
@Table (name = "client")
@Getter
@Setter
@ToString

public class Client {
    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String fullName;

    private LocalDate birthDate;

    @Column (nullable = false)
    private String phoneNumber;
}
