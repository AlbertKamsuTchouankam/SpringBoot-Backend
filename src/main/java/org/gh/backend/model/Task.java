package org.gh.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Die ModellSchicht, dient dazu das datenmodel des Entity Task zu erstellen genauso wie es in der DatenBank aussehen soll
 */


@Entity
@Table(name="task")

public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    // Relation ManyToOne mit Project : ein Task gehört zu genau einem Projekt
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "project_id")  // diese Zeile enthält der Fremdschlüssel
    private Project project;



    // Konstruktor
    public Task() {}

    public Task(String title, Project project) {
        this.title = title;
        this.project = project;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
