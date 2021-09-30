package com.example.demogol.repository;

import com.example.demogol.entity.File;
import com.example.demogol.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {

    Optional<File> findFileById(Long aLong);

    List<File> findAllByUserOrderByCreateDateDesc(User user);
}
