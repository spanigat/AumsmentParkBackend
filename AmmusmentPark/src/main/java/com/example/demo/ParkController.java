package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("parkuser")
public class ParkController {
	
@Autowired
ParkRepository repository;

@GetMapping
List<Park>  getAllUsers() {
	return repository.findAll();
}


@GetMapping("{id}")
ResponseEntity<Park> getUserById(@PathVariable(value = "id") Long pid) 
{
  Optional<Park> e1= repository.findById(pid);
  return ResponseEntity.ok().body(e1.get());
  
}


@DeleteMapping("{id}")
public String deleteById(@PathVariable(value = "id") Long pid) 
{
  Optional<Park> e1= repository.findById(pid);
  if (e1.isPresent()) {
	  repository.deleteById(pid);
	  return "deleted";
  } else {
	  return "error";
  }
 }


@PutMapping("{id}")
public  ResponseEntity<Park> updateUser(@PathVariable(value = "id") Long userid,@RequestBody  Park p) 
{
 	 
	  p.setName(p.getName());
	  p.setAge(p.getAge());
	  p.setNoOfRide(p.getNoOfRide());
	  p.setRideName(p.getRideName());
	  p.setTypeOfRide(p.getTypeOfRide());
	  p.setAmount(p.getAmount());

	  System.out.println(p.getName());
	  final Park updatedUser = repository.save(p);
      return ResponseEntity.ok(updatedUser);
 
 }


@PostMapping
 public Park insertUser(@RequestBody Park p) {

		return repository.save(p);
	 
	
	
 }

}
	



