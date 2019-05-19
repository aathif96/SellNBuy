package com.paf.prj.PAF_1.repository;

import com.paf.prj.PAF_1.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends JpaRepository<Categories, Long> {

	Categories findOne(Long cat_n);


}
