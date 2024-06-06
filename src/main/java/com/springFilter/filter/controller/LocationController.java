package com.springFilter.filter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springFilter.filter.dto.LocationDto;
import com.springFilter.filter.entity.SchoolNames;
import com.springFilter.filter.service.ServiceImplement;

@RestController
@RequestMapping("/locate/api")
public class LocationController {
	
	@Autowired
	private ServiceImplement implement;
	
	@PostMapping("/post")
	public SchoolNames post(@RequestBody SchoolNames names) {
		return implement.pots(names);
	}
	
	@PostMapping("/postall")
	public List<SchoolNames>postall(@RequestBody List<SchoolNames> list){
		return implement.postall(list);
	}
	
	@GetMapping("/get")
	public List<SchoolNames> get(@RequestParam (value = "sname",required = false) String  sname){
		return implement.get(sname);
		
	}
	
	@GetMapping("/getall")
	public List<SchoolNames>getall(){
		return implement.getall();
	}
	
	
	@PutMapping("/update")
	public SchoolNames update(@RequestBody SchoolNames names) {
		return implement.update(names);
		
	}
//	@DeleteMapping("/delete/{sname}")
//	public SchoolNames delete(@PathVariable ("sName")  String name) {
//		return implement.delete(name);
//		
//	}
	@PostMapping("/postdto")
	public SchoolNames post(@RequestBody LocationDto dto) {
		return implement.post(dto);
	
	}
	
	@GetMapping("/gets")
	public List<LocationDto> get1(@RequestParam (value="location",required = false)String location  ){
		return implement.get1(location);
		
		
	}
	
	
	
	


}
