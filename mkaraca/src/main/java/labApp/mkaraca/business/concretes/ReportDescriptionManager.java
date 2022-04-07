package labApp.mkaraca.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import labApp.mkaraca.business.abstracts.ReportDescriptionService;
import labApp.mkaraca.dataAccess.abstracts.ReportDescriptionDao;
import labApp.mkaraca.entities.concretes.ReportDescription;
@Service
public class ReportDescriptionManager implements ReportDescriptionService {
	private ReportDescriptionDao reportDescriptionDao;
	@Autowired
	public ReportDescriptionManager(ReportDescriptionDao reportDescriptionDao) {
		super();
		this.reportDescriptionDao = reportDescriptionDao;
	}
	@Override
	public List<ReportDescription> getAll() {
		return this.reportDescriptionDao.findAll();
	}

}
