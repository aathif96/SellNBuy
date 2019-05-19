package com.paf.prj.PAF_1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.paf.prj.PAF_1.Categories;
import com.paf.prj.PAF_1.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryDAO {

	@Autowired
	CategoryRepository categoryRepositary;
	
	/* to save a Category*/
	public Categories save(Categories cat) {
		return categoryRepositary.save(cat);
	}
	
	/* search all categories*/
	public List<Categories> findAll(){
		return categoryRepositary.findAll();
	}
	
	
	/*get a categories*/
	public Categories findOne(Long catid) {
		return categoryRepositary.findOne(catid);
	}
	
	/*delete categories*/
	public void delete(Categories cat) {
		categoryRepositary.delete(cat);
	}
}
