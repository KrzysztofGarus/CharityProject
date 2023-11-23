package pl.coderslab.charity.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    @Email
    private String username;
    @NotBlank
    private String password;

    private String role;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Donation> donations;

    private Boolean active;

}
