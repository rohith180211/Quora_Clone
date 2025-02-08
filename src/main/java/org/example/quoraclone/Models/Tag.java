package org.example.quoraclone.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Tag extends BaseModel{
    private String name;
    @ManyToMany(mappedBy = "followedTags")
    private Set<User> followers;
}
