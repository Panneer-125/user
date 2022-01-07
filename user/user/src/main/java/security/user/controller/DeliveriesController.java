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

import security.user.model.Deliveries;
import security.user.service.DeliveriesService;
@RequestMapping("/deliver")
@RestController
public class DeliveriesController {
@Autowired
DeliveriesService deliveriesService;
@PostMapping("/deliveries")
public Deliveries saveDeliveries(@RequestBody Deliveries deliveries) {
	deliveries=deliveriesService.saveDelivery(deliveries);
	return deliveries;
}
@GetMapping("/deliveries/{godownId}")
public Deliveries getDeliveries(@PathVariable("godownId")int godownId) {
	Deliveries d=deliveriesService.getDelivery(godownId);
	return d;
}
@GetMapping("/deliveries")
public List<Deliveries> getAllDeliveries(){
	List <Deliveries> d=deliveriesService.getAllDelivery();
	return d;
	
}
@DeleteMapping(value="/delete/{godownId}")
public void deleteDeliveries(@PathVariable("godownId") int godownId) {
	deliveriesService.deleteDeliveries(godownId);
}
}