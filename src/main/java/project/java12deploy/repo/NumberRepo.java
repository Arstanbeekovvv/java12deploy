package project.java12deploy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.java12deploy.entity.Number;

@Repository
public interface NumberRepo extends JpaRepository<Number,Long> {
}
