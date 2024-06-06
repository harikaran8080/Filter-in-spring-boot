package com.springFilter.filter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springFilter.filter.dto.LocationDto;
import com.springFilter.filter.entity.SchoolNames;
import com.springFilter.filter.repository.LocationRepository;

@Service
public class LocationService implements ServiceImplement {
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public SchoolNames pots(SchoolNames names) {
		return locationRepository.save(names);
	}

	@Override
	public List<SchoolNames> postall(List<SchoolNames> list) {
		return locationRepository.saveAll(list);
	}



	@Override
	public List<SchoolNames> getall() {
		return locationRepository.findAll();
	}

	@Override
	public SchoolNames update(SchoolNames names) {
		Optional<SchoolNames>optional=locationRepository.findById(names.getSid());
		SchoolNames schoolNames=optional.get();
		schoolNames.setSid(names.getSid());
		schoolNames.setName(names.getName());
		schoolNames.setType(names.getType());
		schoolNames.setLocation(names.getLocation());
		return locationRepository.save(schoolNames);
	}

//	@Override
//	public SchoolNames delete(String sname) {
//		return locationRepository.deleteById(sname);
//	}

	@Override
	public List<SchoolNames> get(String name) {
		if(name == null) {
			return locationRepository.findAll();
			
		}
		else {
			return locationRepository.findByName(name);
		}
		
		
	}

	@Override
	public SchoolNames post(LocationDto dto) {
		SchoolNames names=new SchoolNames();
		names.setSid(dto.getSid());
		names.setName(dto.getName());
		names.setLocation(dto.getLocation());
		names.setType(dto.getType());
		return locationRepository.save(names);
		
	}

	@Override
	public List<LocationDto> get1(String location) {
		List<SchoolNames>optional=locationRepository.findByLocation(location);
		List<LocationDto>dtos=new ArrayList<LocationDto>();
		for(SchoolNames s:optional) {
			LocationDto dto=new LocationDto();
			dto.setSid(s.getSid());
			dto.setName(s.getName());
			dto.setLocation(s.getLocation());
			dto.setType(s.getType());
			dtos.add(dto);
			if(location == null) 
			{
			           locationRepository.findAll();
			}
			else 
			{
				        locationRepository.findByName(location);
			}
		}
		return dtos;
		
	
		
	}



	

}
