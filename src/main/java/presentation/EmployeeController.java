package presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import data.EmployeeRepository;

@Controller
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("/employee")
    public String getEmployees(Model model) {
        model.addAttribute("employee", employeeRepository.findAll());
        return "employee";
    }

}
