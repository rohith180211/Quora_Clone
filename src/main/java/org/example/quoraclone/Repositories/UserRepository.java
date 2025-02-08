package org.example.quoraclone.Repositories;

import org.example.quoraclone.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
