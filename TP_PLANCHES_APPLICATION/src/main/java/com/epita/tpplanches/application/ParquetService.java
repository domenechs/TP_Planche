package com.epita.tpplanches.application;

import com.epita.tpplanches.domain.Parquet;

public interface ParquetService {
	
	void calculPlanche(String nomPiece,double surface);
	Parquet getParquet(long id);

}
