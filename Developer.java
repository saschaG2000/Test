package SWED;

public class Developer {
    private String name;
    private int age;
    private int experience;
    private String specialty;
    private String githubUsername;

    public Developer(String name, int age, int experience, String specialty, String githubUsername) {
        setName(name);
        setAge(age);
        setExperience(experience);
        setSpecialty(specialty);
        setGithubUsername(githubUsername);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Age must be positive");
        this.age = age;
    }

    public void setExperience(int experience) {
        if (experience < 0) throw new IllegalArgumentException("Experience cannot be negative");
        this.experience = experience;
    }

    public void setSpecialty(String specialty) {
        if (specialty == null || specialty.isEmpty()) throw new IllegalArgumentException("Specialty cannot be empty");
        this.specialty = specialty;
    }

    public void setGithubUsername(String githubUsername) {
        if (githubUsername == null || githubUsername.isEmpty()) throw new IllegalArgumentException("GitHub username cannot be empty");
        this.githubUsername = githubUsername;
    }

    public void developSoftware() {
    	System.out.println("Developing software..."); 
    	}
    
    public void fixBugs() { 
    	System.out.println("Fixing bugs..."); 
    	}
    
    public void writeTests() {
    	System.out.println("Writing tests...");
    	}
    
    public void updatePortfolio() { 
    	System.out.println("Updating portfolio...");
    	}
    
    public void attendMeeting() {
    	System.out.println("Attending meeting...");
    	}
}
