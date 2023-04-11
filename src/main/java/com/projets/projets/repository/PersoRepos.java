package com.projets.projets.repository;

import com.projets.projets.models.Personnes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersoRepos extends JpaRepository<Personnes,Integer> {

}
