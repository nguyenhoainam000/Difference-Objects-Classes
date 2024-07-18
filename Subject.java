public class Subject
{
    private String name;
    private String professor;
    private int credits;

    public Subject(String name, String professor, int credits)
    {
        this.name = name;
        this.professor = professor;
        this.credits = credits;
    }

    public void print()
    {
        System.out.println("Subject: " + name + ", Professor: " + professor + ", Credits: " + credits);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getProfessor()
    {
        return professor;
    }

    public void setProfessor(String professor)
    {
        this.professor = professor;
    }

    public int getCredits()
    {
        return credits;
    }

    public void setCredits(int credits)
    {
        this.credits = credits;
    }
}
