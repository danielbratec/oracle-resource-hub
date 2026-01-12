@Entity
@Table(name = "DEPARTAMENTS")
@Data
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    Private String name;
}