package com.epita.tpplanches.infrastructure;

import java.util.List;

import com.epita.tpplanches.domain.Parquet;

public interface DaoParquet {
	
	void saveParquet(Parquet parquet);
	Parquet getParquet(long id);
	List<Parquet> getAllParquet();

}
