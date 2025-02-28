package org.gh.backend.repository;

import org.gh.backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Hier wird eine schnittstelle TaskRepository erstellt, die benutzt werden soll, um Anfragen an unserer DatenBank zu senden
 */

@Repository
public interface TaskRepository extends JpaRepository <Task,Integer> {

/*
 * Die Anfrage gibt, alle Task, die zu einem spezifischen Projekt gehören
 */
    @Query("SELECT t FROM Task t WHERE t.project.id = :id ")
   List<Task> findAllTaskByProjectId (@Param("id") int id);
}
