/**
 * Bruce Gavins
 * MSI-5030
 * Assignment 3
 */

/**
  * This is a class to represent a patient's health checkup data.
  * It stores and manages patient information including patient number, blood pressure values, and cholesterol figures.
  * It provides methods to get and set these values, calculate the LDL/HDL cholesterol ratio, and format the data as a string.
  */

public class GavinsBruce_Checkup {
    //Creating variables to store patient data
    private String patientNumber; //unique indentifier for the patient 
    private int systolic; // (mmHg)
    private int diastolic; // (mmHg)
    private double ldl; // (mg/dL)
    private double hdl; // (mg/dL)


    /**
     * Constructor that initializes a new Checkup object with a patient number.
     * All other values are set to default until explicitly set.
     *
     */

    public GavinsBruce_Checkup(String patientNumber) {
	this.patientNumber = patientNumber;
	this.systolic = 0;
	this.diastolic = 0;
	this.ldl = 0;
	this.hdl = 0;

    }

    /** Gets the patient number.

     * returns the patient number
     */

    public String getPatientNumber() {
	return patientNumber;
    }

    /**
     * Sets patient number
     *takes parameter of new patient number
     */

    public void setPatientNumber(String patientNumber) {
	this.patientNumber = patientNumber;
    }

    /**
     * Gets systolic blood pressure value.
     * returns in mmHg
     */

    public int getSystolic() {
	return systolic;
    }

    /**
     * sets the systolic bp value
     * takes parameter of new systolic bp as integer
     */

    public void setSystolic(int systolic) {
	this.systolic = systolic;
    }

    /**
     * Gets diastolic bp value
     * returns diastolic bp in mmHg
     */
    public int getDiastolic() {
	return diastolic;
    }

    /**
     * sets diastolic bp value
     * takes parameter of new diastolic bp as integer
     */
    public void setDiastolic(int diastolic) {
	this.diastolic = diastolic;
    }

    /**
     * Gets the LDL cholesterol level
     * returns level in mg/dL
     */
    public double getLdl() {
	return ldl;
    }

    /** sets LDL level
     * takes parameter of new LDL level
     */
    public void setLdl(double ldl) {
	this.ldl = ldl;
    }

    /** Gets the HDL cholesterol level
     * returns level in mg/dL
     */
    public double getHdl() {
	return hdl;
    }

    /** Sets HDL level
     * takes parameter of new HDL level
     */
    public void setHdl(double hdl) {
	this.hdl = hdl;
    }
    

    /** Calculates the ratio of LDL to HDL cholesterol.
     * ratio >= 3.5 is considered optimal
     * returns ratio, returns 0 if HDL is zero to prevent division by zero error
     */
    public double calculateRatio() {
	//Prevents division by zero
	if (hdl == 0) {
	    return 0;
	}
	return ldl / hdl;
    }

    /** Creates string representation of checkup data to print to screen
     * formats all values in strings
     */

    public String toString() {
	double ratio = calculateRatio();

	return "Patient Number: " + patientNumber + "\n" +
	       "Blood Pressure: " + systolic + "/" + diastolic + " mmHg\n" +
	       "LDL Cholesterol: " + ldl + " mg/dL\n" +
	       "HDL Cholesterol: " + hdl + " mg/dL\n" +
	       "LDL/HDL Ratio: " + ratio + "\n" +
	       "Note: HDL is known as \"good cholesterol\" and a ratio of 3.5 or lower is considered optimal.";
    }
}

      
    
    
