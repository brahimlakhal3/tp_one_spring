package com.ensa.tp_one.repository;

import com.ensa.tp_one.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
