package labApp.mkaraca.entities.concretes;

import java.util.Date;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "reportDescriptions")
public class ReportDescription {
	@Id
	@GeneratedValue
	@Column(name = "reportDescription_id")
	private int id;
	@Column(name = "laborant_id")
	private int laborantId;
	@Column(name = "file_no")
	private double fileNo;
	@Column(name = "patient_name")
	private String patientName;
	@Column(name = "patient_surname")
	private String patientSurname;
	@Column(name = "patient_identityNo")
	private String identityNo;
	@Column(name = "diagnosed_title")
	private String diagnosedTitle;
	@Column(name = "diagnosis_details")
	private String diagnosisDetails;
	@Column(name = "report_date")
	private Date reportDate;
	@Column(name = "report_image")
	private String  reportImage;
	
	public ReportDescription() {}
	public ReportDescription(int id,int laborantId,double fileNo,String patientName,
			String patientSurname,String identityNo,String diagnosedTitle,String diagnosisDetails,
			Date reportDate,String  reportImage) {
		super();
		this.id=id;
		this.laborantId=laborantId;
		this.fileNo=fileNo;
		this.patientName=patientName;
		this.patientSurname=patientSurname;
		this.identityNo=identityNo;
		this.diagnosedTitle=diagnosedTitle;
		this.diagnosisDetails=diagnosisDetails;
		this.reportDate=reportDate;
		this.reportImage=reportImage;
	}
}
