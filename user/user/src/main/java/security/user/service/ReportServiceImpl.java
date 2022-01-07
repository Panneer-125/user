package security.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.user.entity.ReportEntity;
import security.user.model.Report;
import security.user.repository.ReportRepository;

@Service
public class ReportServiceImpl implements ReportService{
@Autowired
ReportRepository reportRepository;
	@Override
	public Report saveReport(Report report) {
		ReportEntity r=new ReportEntity();
		r.setMonthlyDeliveries(report.getMonthlyDeliveries());
		r.setMonthlyInwards(report.getMonthlyInwards());
		r.setMonthlyReturns(report.getMonthlyReturns());
		reportRepository.save(r);
		return report;
	}

	@Override
	public Report getReport(int id) {
		ReportEntity r=reportRepository.getById(id);
		Report r1=new Report();
		r1.setMonthlyDeliveries(r.getMonthlyDeliveries());
		r1.setMonthlyInwards(r.getMonthlyInwards());
		r1.setMonthlyReturns(r.getMonthlyReturns());
		return r1;
	}

	@Override
	public List<Report> getAllReport() {
		List<Report> r=new ArrayList<Report>();
		List<ReportEntity>r1=reportRepository.findAll();
		for(ReportEntity reportEntity:r1) {
			Report r2=new Report();
			r2.setMonthlyDeliveries(reportEntity.getMonthlyDeliveries());
			r2.setMonthlyInwards(reportEntity.getMonthlyInwards());
			r2.setMonthlyReturns(reportEntity.getMonthlyReturns());
			r.add(r2);
		}
		
		return r;
	}

	@Override
	public void deleteReport(int id) {
		reportRepository.deleteById(id);
		
		
	}

}
