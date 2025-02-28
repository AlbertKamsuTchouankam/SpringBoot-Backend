package org.gh.backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;
import java.util.List.*;

/**
 * Die ModellSchicht, dient dazu das datenmodel des Entity Project zu erstellen genauso wie es in der DatenBank aussehen soll
 */

@Entity
@Table(name="project")

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;


    @JsonManagedReference
        // Relation OneToMany mit Task : Ein Projekt kann mehrere Tasks haben
        @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
        private List<Task> tasks = new ArrayList<>();

        // Konstruktor
        public Project() {}

        public Project(String title) {
            this.title = title;
        }

        // Getters und Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<Task> getTasks() {
            return tasks;
        }

        public void setTasks(List<Task> tasks) {
            this.tasks = tasks;
        }

}

