package com.epita.tpplanches.infrastructure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.epita.tpplanches.domain.Parquet;

@Repository
public class DaoParquetImpl implements DaoParquet {

	public void saveParquet(Parquet parquet) {
		SessionFactory session = HibernateUtil.getSessionFactory();
		Session sessionParquet = session.openSession();
		sessionParquet.beginTransaction();
		sessionParquet.save(parquet);
		sessionParquet.getTransaction().commit();
		sessionParquet.close();

	}

}
