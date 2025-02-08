package org.example.quoraclone.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Question extends BaseModel {
    private String title;
    private String content;
    @ManyToMany
    @JoinTable(
            name = "question_tags",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany
    private Set<Answer> answers;
}
