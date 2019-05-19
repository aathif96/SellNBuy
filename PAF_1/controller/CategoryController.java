package com.paf.prj.PAF_1.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paf.prj.PAF_1.Categories;
import com.paf.prj.PAF_1.dao.CategoryDAO;

@RestController
@RequestMapping("/company")
public class CategoryController {
	
	@Autowired
	CategoryDAO categoryDAO;

	/*to save categories*/
	@PostMapping("/categoryy")

	public Categories createCategory(@Valid @RequestBody Categories cat) {
		return categoryDAO.save(cat);
	}

	
	/*get all categories*/
	@GetMapping("/categoryy")
	public List<Categories> getAllCategories(){
		return categoryDAO.findAll();
	}

	/*get categories from catid*/
	@GetMapping("/categories/{id}")
	public ResponseEntity<Categories> getCategoriesById(@PathVariable(value="id") Long catid){
		
		Categories catgories=categoryDAO.findOne(catid);
		
		if(catgories==null)
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(catgories);
		
	}
	
	/*update categories by catid*/
	@PutMapping("/categories/{id}")
	public ResponseEntity<Categories> updateCategories(@PathVariable(value="id") Long catid, @Valid @RequestBody Categories catDetails){
		Categories catgories=categoryDAO.findOne(catid);
		if(catgories==null)
		{
			return ResponseEntity.notFound().build();
		}
		catgories.setName(catDetails.getName());
		catgories.setDesignatiiom(catDetails.getDesignation());
		catgories.setExpertise(catDetails.getExpertise());

		Categories updateCategories=categoryDAO.save(catgories);
		return ResponseEntity.ok().body(updateCategories);
	}
	
	
	/*Delete categories*/
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<Categories> deleteCategories(@PathVariable(value="id") Long catid){
		
		Categories catgories=categoryDAO.findOne(catid);
		
		if(catgories==null)
		{
			return ResponseEntity.notFound().build();
		}
		categoryDAO.delete(catgories);
		
		return ResponseEntity.ok().build();
	}
}






