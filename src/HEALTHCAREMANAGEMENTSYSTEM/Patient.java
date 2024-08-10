package HEALTHCAREMANAGEMENTSYSTEM;

class Patient {
	private int patientId;
	private String patientName;
	private String patientDisease;
	private String patientTreatment;
	private String patientInsuranceProvider;

	public Patient(int patientId, String patientName, String patientDisease, String patientTreatment,
			String patientInsuranceProvider) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientDisease = patientDisease;
		this.patientTreatment = patientTreatment;
		this.patientInsuranceProvider = patientInsuranceProvider;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDisease() {
		return patientDisease;
	}

	public void setDisease(String disease) {
		this.patientDisease = disease;
	}

	public String getTreatment() {
		return patientTreatment;
	}

	public void setTreatment(String treatment) {
		this.patientTreatment = treatment;
	}

	public String getInsuranceProvider() {
		return patientInsuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		this.patientInsuranceProvider = insuranceProvider;
	}
}