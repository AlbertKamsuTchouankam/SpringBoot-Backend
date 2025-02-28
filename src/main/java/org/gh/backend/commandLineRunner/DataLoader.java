package org.gh.backend.commandLineRunner;

import org.gh.backend.model.Project;
import org.gh.backend.model.Task;
import org.gh.backend.repository.ProjectRepository;
import org.gh.backend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    /**
     * In dieser Klasse werden ein parr Daten in der DatenBank bei run des Backends erstellt.
     * Dies ist nur dazu gemeint die Funktionalitäten zu testen.
     */

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {
        // Paar Projekte werden erstellt
        Project project1 = new Project("Project A");
        Project project2 = new Project("Project B");
        Project project3 = new Project("Project C");
        Project project4 = new Project("Project D");

        // Projekte werden in der DatenBank gespeichert
        projectRepository.save(project1);
        projectRepository.save(project2);
        projectRepository.save(project3);
        projectRepository.save(project4);




        // Tasks erstellen, die zu den Projekten verbunden sind
        Task task1 = new Task("Task 1",  project1);
        Task task2 = new Task("Task 2",  project2);
        Task task3 = new Task("Task 3",  project1);
        Task task4 = new Task("Task 4",  project1);

        // Tasks werden in der DatenBank gespeichert
        taskRepository.save(task1);
        taskRepository.save(task2);
        taskRepository.save(task3);
        taskRepository.save(task4);

        System.out.println("Daten werden erfolgreich in der DatenBank gespeichert");
    }


}
