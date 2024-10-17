package ru.medvedev.lesson8.page;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.medvedev.lesson8.model.Project;
import ru.medvedev.lesson8.service.ProjectService;
import ru.medvedev.lesson8.service.TimesheetPageService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/home/projects")
@RequiredArgsConstructor
public class ProjectPageController {

    private final ProjectService projectService;
    private final TimesheetPageService timesheetService;


    @GetMapping("/{id}")
    public String getProjectPage(@PathVariable Long id, Model model) {
        Optional<Project> projectOpt = projectService.getById(id);
        if (projectOpt.isEmpty()) {
            return "not-found.html";
        }
        Optional<TimesheetPageDto> timesheets = timesheetService.findById(id);

        model.addAttribute("project", projectOpt.get());
        model.addAttribute("timesheets", timesheets);

        return "project-page.html";
    }

    @GetMapping
    public String getAllProjectsPage(Model model) {
        List<Project> projects = projectService.getAll();
        model.addAttribute("projects", projects);
        return "projects-page.html";
    }
}