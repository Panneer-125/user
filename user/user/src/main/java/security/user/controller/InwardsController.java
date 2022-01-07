package security.user.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import security.user.model.Godown;
import security.user.model.Inwards;
import security.user.service.InwardsService;
@RequestMapping("/smart")

@RestController
public class InwardsController {
@Autowired
InwardsService inwardsService;
@PostMapping("/save")
public Inwards saveInwards(@RequestBody Inwards inwards) {
	inwards=inwardsService.saveInwards(inwards);
	return inwards;
	
}
@GetMapping(value="/inwards/{godownId}")
public Inwards getInwards(@PathVariable("godownId") int godownId) {
	Inwards i=inwardsService.getInwards(godownId);
	return i;	
}
@GetMapping(value="/file")
public List<Inwards> getAllInwards(){
	List<Inwards> s= inwardsService.getAllInwards();
	return s;
}
@DeleteMapping(value="/delete/{godownId}")
public void deleteInwards(@PathVariable("godownId") int godownId) {
	inwardsService.deleteInwards(godownId);
}
}