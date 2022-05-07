package dsa_java.designpattern;

class Employee {
    private String name;
    private String dept;
    private int eNO;
    private boolean isMarried;

    private Employee(String name, String dept, int eNO, boolean isMarried) {
        this.name = name;
        this.dept = dept;
        this.eNO = eNO;
        this.isMarried = isMarried;
    }
    static class Builder {
        private String name;
        private String dept;
        private int eNO;
        private boolean isMarried;

        public Builder builder() {
            return this;
        }

        public Employee build() {
            return new Employee(this.name, this.dept, this.eNO, this.isMarried);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDept(String dept) {
            this.dept = dept;
            return this;
        }

        public Builder seteNO(int eNO) {
            this.eNO = eNO;
            return this;
        }

        public Builder setMarried(boolean married) {
            isMarried = married;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", eNO=" + eNO +
                ", isMarried=" + isMarried +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int geteNO() {
        return eNO;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
public class BuilderPattern {
    public static void main(String[] args) {
        Employee e1 = new Employee.Builder().builder().seteNO(21).setName("Gyana").build();
        Employee e2 = new Employee.Builder().builder().setDept("CIVIL Service").seteNO(212).setName("Satya").setMarried(false).build();
        System.out.println(e1);
        System.out.println(e2);
    }
}
