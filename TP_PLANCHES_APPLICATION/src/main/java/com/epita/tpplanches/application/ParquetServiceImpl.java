package com.epita.tpplanches.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epita.tpplanches.domain.Parquet;
import com.epita.tpplanches.infrastructure.DaoParquet;

@Service
public class ParquetServiceImpl implements ParquetService {

	@Autowired
	private DaoParquet daoParquet;
	
	public void calculPlanche(String nomPiece,double surface) {
		
		Parquet parquet = new Parquet();
		parquet.setNomPiece(nomPiece);
		parquet.setSurface(surface);
		parquet.setNombrePlanche(Calcul.calculerNombrePlanche(surface));
		daoParquet.save(parquet);
		
	}

	public Parquet getParquetByName(String nom) {
		return daoParquet.findByNomPiece(nom);
	}

	/*public Parquet getParquet(long id) {
		return daoParquet.findById(id);
	}

	public List<Parquet> getAllParquet() {
		return daoParquet.findAll();
	}*/

}
