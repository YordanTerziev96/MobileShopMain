package com.mobileshop.services;

import com.mobileshop.models.Brand;
import com.mobileshop.models.Model;
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

	public List<Brand> getAllBrands(){

		 return em.createQuery("Select b from Brand b").getResultList();
	}

	public String insertBrands(String inputBrands){

		List<String> brands = List.of(inputBrands.split(","));
		for (String b : brands) {
			Brand brand = new Brand();
			brand.setBrand(b);
			em.persist(brand);
		}
		return "Brands have been added successfully";
	}

	public String addModelsToBrand(String inputBrand, String inputModels){
		Brand brand = (Brand)em.createQuery("Select b from Brand b where b.brand = :p_brand")
				.setParameter("p_brand", inputBrand).getSingleResult();
		List<String> modelsToBeAdded = List.of(inputModels.split(","));
		List<Model> models;
		for (String m : modelsToBeAdded) {
			Model model = new Model();
			model.setBrand(brand);
			model.setModel(m);
			em.persist(model);
		}
		return "Models have been added to brand: " + brand.getBrand() + " successfully!";
	}
}
