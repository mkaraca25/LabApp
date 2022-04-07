package labApp.mkaraca.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import labApp.mkaraca.entities.concretes.ReportDescription;

public interface ReportDescriptionDao extends JpaRepository<ReportDescription, Integer>{

}
