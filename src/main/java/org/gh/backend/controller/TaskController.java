package org.gh.backend.controller;


import org.gh.backend.model.Task;
import org.gh.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Diese KontrolleSchicht leitet die Anfrage an den Dienst weiter(TaskService), der die für die Anfrage erforderliche Operation verarbeite
 */

@RestController
@RequestMapping("/api/project/{id}")

public class TaskController {

    @Autowired // ✅ Spring Boot injiziert automatisch TaskService
    private TaskService taskService;

    @GetMapping("/task")
    public List<Task> getAllTaskByProject( @PathVariable int id){
        return taskService.getAllTaskByProjectId(id);
    }


}
