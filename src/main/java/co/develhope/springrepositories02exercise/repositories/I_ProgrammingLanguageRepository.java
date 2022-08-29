package co.develhope.springrepositories02exercise.repositories;

import co.develhope.springrepositories02exercise.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages")
public interface I_ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
