package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name ="task_10")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @Column(name ="task_name ",nullable = false)
    private String task_name ;

    @Column(name= "task_status", nullable = false )
    private String task_status;
    @ManyToOne
    @JoinColumn(name ="author")
    private User author;

    public Task() {
    }

    public Task(String task_name,  String task_status, User author) {
        this.task_name = task_name;
        this.task_status = task_status;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }


    public String getTask_status() {
        return task_status;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
