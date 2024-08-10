package HEALTHCAREMANAGEMENTSYSTEM;
class Doctor {
    private int id;
    private String name;
    private String specialization;
    private String qualifications;
    

    public Doctor(int id, String name, String specialization, String qualifications) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.qualifications = qualifications;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

   
}