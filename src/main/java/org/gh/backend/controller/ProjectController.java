package org.gh.backend.controller;


import org.gh.backend.model.Project;
import org.gh.backend.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


/**
 * Diese KontrolleSchicht leitet die Anfrage an den Dienst weiter(ProjectService), der die für die Anfrage erforderliche Operation verarbeite
 */


@RestController
@RequestMapping("/api/project")

public class ProjectController {

    @Autowired // ✅ Spring Boot injiziert automatisch ProjectService
    ProjectService projectService;
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @GetMapping
    public List<Project> getAllProjects (){
        logger  .info("Returning " + "HJ" + " tasks for project id: " + id); // Log le nombre de tâches retournées
       return projectService.getAllProjects();

    }

    @GetMapping("/{id}")
    public Project getProjectById ( @PathVariable int id){
        return projectService.getProjectById(id);

    }
}
