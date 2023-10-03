public class People {
    private String name;
    private int age;
    private String job;
    private String id;
    private static int counter;

    String space = "0";
    public People(String name, int age, String job) {
        counter++;
        this.name = name;
        this.age = age;
        this.job = job;
        this.id = job.substring(0, 3).toUpperCase() + space.repeat(3 - String.valueOf(counter).length()) + counter;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getJob() {
        return this.job;
    }

    public String getId() {
        return this.id;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return this.getId() + ": " + this.getName() + ", " + this.getAge() + " years old, " + this.getJob(); 
    }

    public void promotion() {
        if (this.getJob().equals("professor") && this.getAge() >= 30) {
            this.setJob("admin");
        }
    }

}
