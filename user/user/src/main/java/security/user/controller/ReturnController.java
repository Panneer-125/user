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

import security.user.model.Report;
import security.user.model.Return;
import security.user.service.ReturnService;
@RequestMapping("/management")
@RestController
public class ReturnController {
@Autowired
ReturnService returnService;
@PostMapping("/returns")
public Return saveReturn(@RequestBody Return returns) {
	returns=returnService.saveReturn(returns);
	return returns;
	
}
@GetMapping("/return/{godownId}")
public Return getReturn(@PathVariable("godownId")int godownId) {
	Return r=returnService.getReturn(godownId);
	return r;
}
@GetMapping("/returnlist")
public List<Return> getAllReturn(){
	List<Return>r=returnService.getAllReturn();
	return r;
}
@DeleteMapping(value="/delete/{godownId}")
public void deleteReturn(@PathVariable("godownId") int godownId) {
	returnService.deleteReturn(godownId);
}
}