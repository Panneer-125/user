package security.user.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.user.model.Godown;
import security.user.service.GodownService;
@RequestMapping("/system")
@RestController
public class GodownController {
	@Autowired
	GodownService godownService;
	@PostMapping(value="/save")
    public Godown  saveGodown(@RequestBody Godown godown) {
		godown=godownService.saveGodowns(godown);
		return godown;
	}
	@GetMapping(value="/godown/{id}")
	public Godown getGodown(@PathVariable("id") int id) {
		Godown g=godownService.getGodown(id);
		return g;	

}
	@DeleteMapping(value="/deletegodown/{godownid}")
	public void deleteGodown(@PathVariable("godownid") int godownid) {
		godownService.deleteGodown(godownid);
}
}