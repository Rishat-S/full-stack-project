package com.example.demogol.repository;

import com.example.demogol.entity.Post;
import com.example.demogol.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FileRepository extends JpaRepository<Post, Long> {

    Optional<Post> findFileById(Long id);

    Optional<Post> findFileByIdAndUser(Long id, User user);

    List<Post> findAllByUserOrderByCreateDateDesc(User user);

}
