package com.mobileshop.services;

import com.mobileshop.models.Pomiqr;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdvertisementService {

	@PersistenceContext
	EntityManager em;

	public Pomiqr getData(String username, String password){
		List<Pomiqr> pomiqri = (List<Pomiqr>) em.createQuery("Select p from Pomiqr p where p.username = :username and p.password = :password")
				.setParameter("username", username).setParameter("password", password).getResultList();

		return pomiqri.get(0);
	}
}
