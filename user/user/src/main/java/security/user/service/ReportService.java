package security.user.service;

import java.util.List;

import security.user.model.Report;

public interface ReportService {
Report saveReport(Report report);
Report getReport(int id);
List<Report> getAllReport();
void deleteReport(int id);
}
