package org.gh.backend.repository;
import org.gh.backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Hier wird eine schnittstelle ProjectRepository erstellt, die benutzt werden soll, um Anfragen an unserer DatenBank zu senden
 */

@Repository

public interface ProjectRepository extends JpaRepository<Project,Integer>{
}
