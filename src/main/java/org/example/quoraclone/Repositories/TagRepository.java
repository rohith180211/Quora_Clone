package org.example.quoraclone.Repositories;

import org.example.quoraclone.Models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TagRepository extends JpaRepository<Tag, Long> {
}
