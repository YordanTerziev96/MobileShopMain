package com.mobileshop.services;

import com.mobileshop.models.Pomiqr;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DemoService {

	@PersistenceContext
	EntityManager em;

	public String insertData(String username, String password) {
		try{
			Pomiqr pomiqr = new Pomiqr();
			pomiqr.setUsername(username);
			pomiqr.setPassword(password);

			em.persist(pomiqr);
			return "Success!";
		}catch (Exception e){
			return e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	public Pomiqr getData(String username, String password){
		List<Pomiqr> pomiqri = (List<Pomiqr>) em.createQuery("Select p from Pomiqr p where p.username = :username and p.password = :password")
				.setParameter("username", username).setParameter("password", password).getResultList();

		return pomiqri.get(0);
	}

}
