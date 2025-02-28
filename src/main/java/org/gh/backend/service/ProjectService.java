package org.gh.backend.service;

import org.gh.backend.model.Project;
import org.gh.backend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * In dieser ServiceSchicht, wird Methoden erstellt, die geeigneten Anweisungen ausführen, die die AnfrageOperationen benötigen
 */

@Service
public class ProjectService {

    @Autowired  // Spring Boot injecte automatiquement ProjectRepository
    private ProjectRepository projectRepo;


    // Alle Projekten werden abgerufen
    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    // Mit einem gegeben id werden Informationen zu dem Projekt abgerufen
    public Project getProjectById (int id){
        return projectRepo.findById(id).orElse(null);
    }
}

