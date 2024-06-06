package com.springFilter.filter.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springFilter.filter.dto.LocationDto;
import com.springFilter.filter.entity.SchoolNames;

@Repository
public interface LocationRepository extends JpaRepository<SchoolNames, Integer> {

	List<SchoolNames> findByName(String name);

	List<SchoolNames> findByLocation(String location);

	

	


	

	// SchoolNames deleteById(String sname);

	

	

}
