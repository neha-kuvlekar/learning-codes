package com.spring.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.mvc.bean.worker;

//@Repository
@Component
public class workerdao {

	@Autowired
	private HibernateTemplate template;


	@Transactional
	public void insert(worker wobj) {
		 this.template.saveOrUpdate(wobj);
	}

	public List<worker> getEmployees(){  
		System.out.println("in dao"+this.template.loadAll(worker.class));
		
		return this.template.loadAll(worker.class); 

	}  

	@Transactional
	public void deleteworker(int id) {		
		worker w = this.template.load(worker.class, id);
		this.template.delete(w);
	}

	@Transactional
	public void updateworker(int id) {		
		worker w = this.template.load(worker.class, id);
		this.template.update(w);
	}
	public worker getworker(int id) {		
		return this.template.load(worker.class, id);
	}
}
