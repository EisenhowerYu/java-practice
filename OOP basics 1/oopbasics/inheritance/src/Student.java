public class Student extends Person {
    private int credit;

    public Student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }

    public int getCredit() {return this.credit;}
    public void setCredit(int credit) {this.credit = credit;}

    public void study() {
        this.credit = this.getCredit() + 1;
    }

    public String toString() {
        return this.getName() + "\n   " + this.getAddress() + "\n   " + "Study credits: " + this.getCredit() + "\n";
    }
}
