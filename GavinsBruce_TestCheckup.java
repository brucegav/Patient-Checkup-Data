/**
 * Bruce Gavins
 * MSI-5030
 * Assignment 3
 */
/** This program tests the GavinsBruce_Checkup class.
 *  It creates instances of the the class, sets values for the objects,
 *  and calls each method to validate functionality.
 *  Two objects will be created and each method will be called at least once.
 *  Print statements will be written to output results.
 */
public class GavinsBruce_TestCheckup {
    /**
     *  Main method that creates and tests the Checkup objects
     */
    public static void main(String[] args) {
	//Creating the first test object and methods
	System.out.println("Creating first patient checkup...");
	GavinsBruce_Checkup patient1 = new GavinsBruce_Checkup("PT12345");
	System.out.println("Initial patient information:");
	System.out.println(patient1);
	System.out.println(); //creating blank line for presentation and clarity

	//Setting values for patient1 object to test setter methods
	System.out.println("Setting patient values...");
	patient1.setSystolic(120);
	patient1.setDiastolic(80);
	patient1.setLdl(100.5);
	patient1.setHdl(50.2);

	//Testing getter methods
	System.out.println("Testing getter methods...");
	System.out.println("Patient Number: " + patient1.getPatientNumber());
	System.out.println("Systolic: " + patient1.getSystolic());
	System.out.println("Diastolic: " + patient1.getDiastolic());
	System.out.println("LDL: " + patient1.getLdl());
	System.out.println("HDL: " + patient1.getHdl());
	System.out.println();

	//Testing calculateRatio method
	System.out.println("Testing calculateRatio method: ");
	double ratio = patient1.calculateRatio();
	System.out.println("LDL/HDL Ratio: " + ratio);
	System.out.println();

	//Testing toString method
	System.out.println("Testing toString method:");
	System.out.println(patient1.toString());
	System.out.println();

	//Create second checkup object with different values
	System.out.println("Creating second patient checkup...");
	GavinsBruce_Checkup patient2 = new GavinsBruce_Checkup("PT67890");

	//Setting values for patient2 (second object)
	patient2.setSystolic(140);
	patient2.setDiastolic(90);
	patient2.setLdl(160.8);
	patient2.setHdl(35.5);

	//Creating display of patient2 information
	System.out.println("PT67890 information: ");
	System.out.println(patient2);
	System.out.println();

	//Comparing patient1 & patient2's cholesterol ratios
	System.out.println("Comparing the patients' cholesterol ratios: ");
	System.out.println("Patient " + patient1.getPatientNumber() + " ratio: " + patient1.calculateRatio());
	System.out.println("Patient " + patient2.getPatientNumber() + " ratio: " + patient2.calculateRatio());
	if (patient1.calculateRatio() <= 3.5 && patient2.calculateRatio() <= 3.5) {
	    System.out.println("Both patients have optimal cholesterol ratios.");
	} else if (patient1.calculateRatio() <= 3.5) {
	    System.out.println("Only patient " + patient1.getPatientNumber() + " has an optimal cholesterol ratio.");
	} else if (patient2.calculateRatio() <= 3.5) {
	    System.out.println("Only patient " + patient2.getPatientNumber() + " has an optimal cholesterol ratio.");
	} else {
	    System.out.println("Neither patient has an optimal cholesterol ratio.");
	}
    }
}
