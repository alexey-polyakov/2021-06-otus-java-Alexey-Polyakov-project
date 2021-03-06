package edu.issuetracker.domain.project.repository;

import edu.issuetracker.domain.project.model.ProjectStatus;
import edu.issuetracker.domain.project.util.rowmapper.ProjectStatusRowMapper;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProjectStatusRepository extends CrudRepository<ProjectStatus, Long> {

    @Override
    @Query(value = "select id, name from project_statuses", rowMapperClass = ProjectStatusRowMapper.class)
    Set<ProjectStatus> findAll();
}
