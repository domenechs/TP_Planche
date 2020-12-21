package com.epita.tpplanches.application;

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
		daoParquet.saveParquet(parquet);
		
	}

}
