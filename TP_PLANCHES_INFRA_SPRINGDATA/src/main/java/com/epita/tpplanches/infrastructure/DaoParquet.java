package com.epita.tpplanches.infrastructure;

import org.springframework.data.repository.CrudRepository;

import com.epita.tpplanches.domain.Parquet;

public interface DaoParquet extends CrudRepository<Parquet, Long>{
	Parquet findByNomPiece(String nom);
}
