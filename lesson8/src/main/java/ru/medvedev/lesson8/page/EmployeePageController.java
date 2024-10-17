package ru.medvedev.lesson8.page;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.medvedev.lesson8.model.Employee;
import ru.medvedev.lesson8.service.EmployeeService;
import ru.medvedev.lesson8.service.TimesheetPageService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Controller
@RequestMapping("/home/employees")
@RequiredArgsConstructor  // Вместо описания, можно использовать @RequiredArgsConstructor
public class EmployeePageController {
    private final EmployeeService service;
    private final TimesheetPageService timesheetService;

    @GetMapping
    public String getAllEmployees(Model model) {
        List<Employee> timesheets = service.findAll();
        model.addAttribute("employees", timesheets);
        return "employees-page.html";
    }

    // GET /home/timesheets/{id}
    @GetMapping("/{id}")
    public String getEmployeePage(@PathVariable Long id, Model model) {
        Optional<Employee> timesheetOpt = service.findById(id);
        if (timesheetOpt.isEmpty()) {
            throw new NoSuchElementException();
        }

        model.addAttribute("employee", timesheetOpt.get());
        return "employee-page.html";
    }

    @GetMapping("/{id}/timesheets")
    public String getTimesheetPage(@PathVariable Long id, Model model){
        List<TimesheetPageDto> timesheets = timesheetService.getTimesheetsByEmployeeId(id);
        if (timesheets.isEmpty()) {
            throw new NoSuchElementException();
        }
        model.addAttribute("timesheets", timesheets);
        return "timesheets-page.html";
    }
}
