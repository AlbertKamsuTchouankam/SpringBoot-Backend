package org.gh.backend.service;

import org.gh.backend.model.Project;
import org.gh.backend.model.Task;
import org.gh.backend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * In dieser ServiceSchicht, wird Methoden erstellt, die geeigneten Anweisungen ausführen, die für die Operation einer Anfrage erforderlich ist.
 */

@Service
public class TaskService {

    @Autowired // Spring Boot injecte automatiquement TaskRepository
    private TaskRepository taskRepo;


  // alle Tasks, die zu einem spezifischen Projekt gehören, werden abgerufen
    public List<Task> getAllTaskByProjectId (int id) {
        return taskRepo.findAllTaskByProjectId(id);
    }
}
