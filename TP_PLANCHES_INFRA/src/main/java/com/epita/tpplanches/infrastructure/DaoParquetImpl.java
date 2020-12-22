package com.epita.tpplanches.infrastructure;

import java.util.List;

import javax.persistence.Query;

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

	public Parquet getParquet(long id) {
		SessionFactory session = HibernateUtil.getSessionFactory();
		Session sessionParquet = session.openSession();
		sessionParquet.beginTransaction();
		Query query = sessionParquet.createQuery("select p from Parquet p where p.id=:id");
		query.setParameter("id", id);
		Parquet parquet = (Parquet) query.getSingleResult();
		sessionParquet.getTransaction().commit();
		sessionParquet.close();
		return parquet;
	}

	public List<Parquet> getAllParquet() {
		SessionFactory session = HibernateUtil.getSessionFactory();
		Session sessionParquet = session.openSession();
		sessionParquet.beginTransaction();
		Query query = sessionParquet.createQuery("select p from Parquet p");
		List<Parquet> parquet = query.getResultList();
		sessionParquet.getTransaction().commit();
		sessionParquet.close();
		return parquet;
	}

}
