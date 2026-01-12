@Entity
@Table(name = "USERS")
@SequenceGenerator(
    name = "user_seq",
    sequenceName = "USER_SEQ",
    allocationSize = 1
)
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
