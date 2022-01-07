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
import security.user.service.ReportService;
@RequestMapping("/reports")
@RestController
public class ReportController {
@Autowired
ReportService reportService;
@PostMapping("/report")
public Report saveReport(@RequestBody Report report) {
	report=reportService.saveReport(report);
	return report;
	
}
@GetMapping("/report/{id}")
public Report getReport(@PathVariable("id")int id) {
	Report r=reportService.getReport(id);
	return r;
	
}
@GetMapping("/repo")
public List<Report> getAllReport(){
	List<Report>r=reportService.getAllReport();
	return r;
}
@DeleteMapping(value="/delete/{id}")
public void deleteReport(@PathVariable("id") int id) {
	reportService.deleteReport(id);
}
}