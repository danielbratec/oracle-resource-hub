@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentRepository repo;

    public DepartmentController(DepartmentRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Department create(@RequestBody Department d) {
        return repo.save(d);
    }

    @GetMapping
    public List<Department> list() {
        return repo.findAll();
    }
}
