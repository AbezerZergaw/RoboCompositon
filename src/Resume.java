import java.util.ArrayList;

public class Resume {


    private Person person;
    private ArrayList<Education> education;
    private ArrayList<Experience> experience;
    private ArrayList<Skill> skill;

    public Resume(Person person, ArrayList<Education> education, ArrayList<Experience> experience, ArrayList<Skill> skill) {
        this.person = person;
        this.education = education;
        this.experience = experience;
        this.skill = skill;


    }

    public Person getPerson() {
        return person;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public ArrayList<Experience> getExperience() {
        return experience;
    }

    public ArrayList<Skill> getSkill() {
        return skill;
    }
}
