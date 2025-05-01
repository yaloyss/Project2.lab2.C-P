package data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Entity
@Table (name = "employee")
@Getter
@Setter
@ToString

public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String fullName;

    private LocalDate birthDate;

    @Column (nullable = false)
    private String phoneNumber;

    private String schedule;

    private String position;
}
