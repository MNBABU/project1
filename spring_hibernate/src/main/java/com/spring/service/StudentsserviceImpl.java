package com.spring.service;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.StudentsDAO;
import com.spring.model.Students;


	@Service
	public class StudentsserviceImpl implements Studentsservice {
		@Autowired
		private StudentsDAO StudentsDAO;

		@Transactional(readOnly=true)
		public List<Students> listStudents() {
			
			return StudentsDAO.listStudents();
		}
		
		
	}

