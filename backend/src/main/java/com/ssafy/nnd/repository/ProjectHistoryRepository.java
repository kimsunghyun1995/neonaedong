package com.ssafy.nnd.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.ssafy.nnd.dto.ProjectHistory;


public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Long> {
	Optional<ProjectHistory> findByIdx(Long idx);
}

