package io.hitos.complexeficbk.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.hitos.complexeficbk.model.Fic;

@Repository
public interface FicRepository extends CrudRepository<Fic, Long> {

	public List<Fic> findByNumber(Long number);
}
