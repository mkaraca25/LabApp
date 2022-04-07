package labApp.mkaraca.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import labApp.mkaraca.business.abstracts.ReportDescriptionService;
import labApp.mkaraca.entities.concretes.ReportDescription;

@RestController 
@RequestMapping("/api/reportDescriptions")
public class ReportDescriptionsController {
	private ReportDescriptionService  reportDescriptionService;
	@Autowired
	public ReportDescriptionsController(ReportDescriptionService reportDescriptionService) {
		super();
		this.reportDescriptionService = reportDescriptionService;
	}
	@GetMapping("/getall")
	public List<ReportDescription> getAll(){
		return this.reportDescriptionService.getAll();
	}

}
