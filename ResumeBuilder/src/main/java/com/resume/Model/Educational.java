package com.resume.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="EDUCATIONAL")
public class Educational {
	private int eid;
	private String HSBoard;
	private String HSInstitute;
	private double HSPercentage;
	private String HSPassingYear;
	
	private String ISBoard;
	private String ISInstitute;
	private double ISPercentage;
	private String ISPassingYear;
	
	private String GBoard;
	private String GInstitute;
	private double GPercentage;
	private String GPassingYear;
	
}
