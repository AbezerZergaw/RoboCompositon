import java.util.ArrayList;

public class Experience {

    private String position;
    private String companyName;
    private String yearsOfExperience;
    private ArrayList<Duty> duties;

    public Experience(String position, String companyName, String yearsOfExperience, ArrayList<Duty> duties) {
        this.position = position;
        this.companyName = companyName;
        this.yearsOfExperience = yearsOfExperience;
        this.duties = duties;
    }

    public Experience() {

    }

    public ArrayList<Duty> getDute() {
        return duties;
    }

    public String getPosition() {
        return position;

    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }


    public void setDute() {
        this.duties = duties;
    }

    public void addDuty(Duty duty) {

        this.duties.add(duty);
    }

}
