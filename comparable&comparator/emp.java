package comparable;

public class emp implements Comparable<emp>{

    private String name;
    private String num;
    private int empID;

    @Override
    public int compareTo(emp o) {
        return this.empID - o.empID;
    }
    
    @Override
    public String toString() {
        return "emp [name=" + name + ", num=" + num + ", empID=" + empID + "]";
    }
    public emp(String name, String num, int empID) {
        this.name = name;
        this.num = num;
        this.empID = empID;
    }
    public String getName(){
        return name;
    }
    public String getNum(){
        return num;
    }
    public int getID(){
        return empID;
    }
   
}
