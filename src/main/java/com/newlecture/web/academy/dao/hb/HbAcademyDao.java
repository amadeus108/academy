package com.newlecture.web.academy.dao.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.newlecture.web.academy.dao.AcademyDao;
import com.newlecture.web.academy.entity.Academy;

@Repository
public class HbAcademyDao implements AcademyDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int insert(Academy academy) {
		 
		Session session = sessionFactory.getCurrentSession();
		
		Object id = session.save(academy);
		
		if(id != null)
			return 1;
		
		return 0;
	}

	@Override
	public int update(Academy academy) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.update(academy);
		
		return 1;
	}

	@Override
	public int delete(String id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Academy academy = new Academy();
		academy.setId(id);
		
		session.remove(academy);
		
		return 1;
	}

	@Override
	@Transactional
	public Academy get(String id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Academy academy = session.get(Academy.class, id);
		
		return academy;
	}
	
	
	
}
