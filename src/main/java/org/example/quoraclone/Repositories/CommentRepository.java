package org.example.quoraclone.Repositories;

import org.example.quoraclone.Models.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findByAnswerId(Long answerId, Pageable pageable);
    Page<Comment> findByParentCommentId(Long parentCommentId, Pageable pageable);
}
