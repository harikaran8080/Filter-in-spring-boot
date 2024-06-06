package com.springFilter.filter.service;

import java.util.List;
import java.util.Optional;

import com.springFilter.filter.dto.LocationDto;
import com.springFilter.filter.entity.SchoolNames;

public interface ServiceImplement {

	SchoolNames pots(SchoolNames names);

	List<SchoolNames> postall(List<SchoolNames> list);

	

	List<SchoolNames> getall();

	SchoolNames update(SchoolNames names);

	// SchoolNames delete(String sname);

	List<SchoolNames> get(String sname);

	SchoolNames post(LocationDto dto);

	List<LocationDto> get1(String location);

}
