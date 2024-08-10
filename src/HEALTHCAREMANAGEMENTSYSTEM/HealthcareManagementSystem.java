package HEALTHCAREMANAGEMENTSYSTEM;
import java.util.Scanner;
public class HealthcareManagementSystem {
    private Patient[] patients;
    private Doctor[] doctors;
    private Appointment[] appointments;
    private int patientCount;
    private int doctorCount;
    private int appointmentCount;
     Scanner scanner = new Scanner(System.in);

    public HealthcareManagementSystem() {
        patients = new Patient[100];
        doctors = new Doctor[100];
        appointments = new Appointment[100];
        patientCount = 0;
        doctorCount = 0;
        appointmentCount = 0;
        
    }
   

    public void addPatient(Patient patient) {
        patients[patientCount] = patient;
        patientCount++;
    }

    public void addDoctor(Doctor doctor) {
        doctors[doctorCount] = doctor;
        doctorCount++;
    }

    public void addAppointment(Appointment appointment) {
        appointments[appointmentCount] = appointment;
        appointmentCount++;
    }

    public void viewPatients() {
        for (int i = 0; i < patientCount; i++) {
            System.out.println(patients[i].getPatientName());
        }
    }

    public void viewDoctors() {
        for (int i = 0; i < doctorCount; i++) {
            System.out.println(doctors[i].getName());
        }
    }

    public void viewAppointments() {
        for (int i = 0; i < appointmentCount; i++) {
            System.out.println(appointments[i].getPatient().getPatientName() + " - " + appointments[i].getDoctor().getName());
        }
    }

    public static void main(String[] args) {
        HealthcareManagementSystem system = new HealthcareManagementSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter patient disease: ");
                    String patientDisease = scanner.nextLine();
                    System.out.print("Enter patient treatment: ");
                    String patientTreatment = scanner.nextLine();
                    System.out.print("Enter patient medical history: ");
                    String patientInsuranceProvider = scanner.nextLine();
                    Patient patient = new Patient(patientId, patientName, patientDisease, patientTreatment,patientInsuranceProvider);
                    system.addPatient(patient);
                    break;

                case 2:
                    System.out.print("Enter doctor ID: ");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter doctor name: ");
                    String doctorName =scanner.nextLine();
                    System.out.print("Enter doctor specialization: ");
                    String specialization = scanner.nextLine();
                    System.out.print("Enter doctor qualifications: ");
                    String qualifications = scanner.nextLine();
                    Doctor doctor = new Doctor(doctorId, doctorName, specialization, qualifications);
                    system.addDoctor(doctor);
                    break;

                case 3:
                    if (system.patientCount == 0 || system.doctorCount == 0) {
                        System.out.println("Add at least one patient and one doctor before creating an appointment.");
                        break;
                    }
                    System.out.print("Enter appointment ID: ");
                    int appointmentId =scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter patient ID for appointment: ");
                    int patientIdForAppointment =scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter doctor ID for appointment: ");
                    int doctorIdForAppointment = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter appointment date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter appointment time (HH:MM): ");
                    String time = scanner.nextLine();
                    System.out.print("Enter appointment reason: ");
                    String reason = scanner.nextLine();
                    System.out.print("Enter appointment status: ");
                    String status = scanner.nextLine();

                    Patient appointmentPatient = null;
                    Doctor appointmentDoctor = null;

                    for (int i = 0; i < system.patientCount; i++) {
                        if (system.patients[i].getPatientId() == patientIdForAppointment) {
                            appointmentPatient = system.patients[i];
                            break;
                        }
                    }

                    for (int i = 0; i < system.doctorCount; i++) {
                        if (system.doctors[i].getId() == doctorIdForAppointment) {
                            appointmentDoctor = system.doctors[i];
                            break;
                        }
                    }

                    if (appointmentPatient != null && appointmentDoctor != null) {
                        Appointment appointment = new Appointment(appointmentId, appointmentPatient, appointmentDoctor, date, time, reason, status);
                        system.addAppointment(appointment);
                        System.out.println("Appointment added successfully.");
                    } else {
                        System.out.println("Invalid patient or doctor ID.");
                    }
                    break;

                case 4:
                    system.viewPatients();
                    break;
                case 5:
                    system.viewDoctors();
                    break;
                case 6:
                    system.viewAppointments();
                    break;
                case 7:
                    scanner.close();
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
