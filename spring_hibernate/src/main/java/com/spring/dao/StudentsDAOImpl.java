package com.spring.dao;
	import java.util.List;
	import org.hibernate.HibernateException;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.spring.model.Students;

	@Repository(value = "studentsDAO")
	public class StudentsDAOImpl implements StudentsDAO {
		 private SessionFactory sessionFactory;
		 @Autowired
		 public StudentsDAOImpl(SessionFactory sessionFactory) {
		        this.sessionFactory = sessionFactory;
		    }
		 @SuppressWarnings("unchecked")
		    public List<Students> listStudents() {
		        List<Students> list = null;
		        Transaction tx = null;
		        try {
		            tx = sessionFactory.getCurrentSession().beginTransaction();
		            list = sessionFactory.getCurrentSession().createQuery("from Students").list();
		            tx.commit();
		        } catch (HibernateException e) {
		            if (tx != null) tx.rollback();
		            e.printStackTrace();
		        }
		        return list;
		    }

		    private SessionFactory getSessionFactory() {
		        return sessionFactory;
		    }

		    private Session getCurrentSession() {
		        Session session = getSessionFactory().getCurrentSession();
		        if (session == null) {
		            session = getSessionFactory().openSession();
		        }
		        return session;
		    }
			
	
	
	
}
