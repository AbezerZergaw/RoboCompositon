
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Education> allEducation = new ArrayList<>();
        ArrayList<Experience> allExperience = new ArrayList<>();
        ArrayList<Duty> allDuty = new ArrayList<>();
        ArrayList<Skill> allSkill = new ArrayList<>();


        String name, email, phoneNumber;
        String option = "";
        System.out.println("Enter your  name");
        name = input.nextLine();

        System.out.println("Enter your email");
        email = input.nextLine();
        System.out.println("Enter you phone number");
        phoneNumber = input.nextLine();

        Person thePerson = new Person(name, email, phoneNumber);

        String major, college, yrOfGrad;
        do {
            System.out.println("Enter your Major");
            major = input.nextLine();
            System.out.println("Enter your college name");
            college = input.nextLine();
            System.out.println("Year of graduation");
            yrOfGrad = input.nextLine();
            Education theEducatoin = new Education(major, college, yrOfGrad);
            allEducation.add(theEducatoin);
            System.out.println("Do you want to add more Education? Y/N");
            option = input.nextLine();
        } while (option.equalsIgnoreCase("y"));


        String postion, compayName, yrOfExperince, duty;

        do {
            System.out.println("Enter your position");
            postion = input.nextLine();
            System.out.println("Enter your company Name");
            compayName = input.nextLine();
            System.out.println("Year of Experience");
            yrOfExperince = input.nextLine();

            do {
                System.out.println("Enter your duty");
                duty = input.nextLine();
                Duty theDuty = new Duty(duty);
                allDuty.add(theDuty);
                System.out.println("Do you want to add more duty? Y/N");
                option = input.nextLine();
            } while (option.equalsIgnoreCase("y"));
            System.out.println("Do you want to add more Experience? Y/N");
            Experience theExperience = new Experience(postion, compayName, yrOfExperince, allDuty);

            allExperience.add(theExperience);
            option = input.nextLine();
        } while (option.equalsIgnoreCase("y"));



        String skills, level;
        do {
            System.out.println("Enter your skills");
            skills = input.nextLine();
            String [] levelOfSkill ={"Fundamental","Novice","Intermediate","Advanced","Expert"};
            System.out.println("Level your skill");
            System.out.println("Fundamental, "+"Novice, "+"Intermediate, "+"Advanced, "+"Expert ");

            //need to be fixed
            for(int i=0; i<levelOfSkill.length;i++){
                level = input.nextLine();
                if(level.equalsIgnoreCase(levelOfSkill[i])){
                    Skill theSkill = new Skill(skills, level);

                    allSkill.add(theSkill);
                }
                else {
                    System.out.println("Invalid input");
                }
            }
            System.out.println("Do you want to add more skill? Y/N");
            option = input.nextLine();

        } while (option.equalsIgnoreCase("y"));


        System.out.println(thePerson.getName() + "\n" + thePerson.getEmail() + "\n");

        Resume resum = new Resume(thePerson, allEducation, allExperience, allSkill);


        System.out.println("Education");
        for (Education eachEducatoin : resum.getEducation()) {
            System.out.println(eachEducatoin.getCollege() + "\n" + eachEducatoin.getMajor() + "\n" + eachEducatoin.getYearOfGraduation() + "\n");
        }


        System.out.println("Experience");
        for (Experience eachExperience : resum.getExperience()) {
            System.out.println(eachExperience.getPosition() + "\n" + eachExperience.getCompanyName() + "\n" + eachExperience.getPosition() + "\n" );
            for (Duty eachDuty:eachExperience.getDute()){
                System.out.println("Duty "+ eachDuty.getDuty());
            }

        }




    }



}
