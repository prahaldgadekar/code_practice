public class program_60_student_info_encapsulation {
    static class Student {
        private int id;
        private String name;
        private String branch;

        void setId(int id) {
            this.id = id;
        }

        void setName(String name) {
            this.name = name;
        }

        void setBranch(String branch) {
            this.branch = branch;
        }

        int getId() {
            return id;
        }

        String getName() {
            return name;
        }

        String getBranch() {
            return branch;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setId(6969);
        s.setName("prahlad");
        s.setBranch("Computer Engineering");

        System.out.println("ID : " + s.getId());
        System.out.println("Name : " + s.getName());
        System.out.println("Branch : " + s.getBranch());
    }
}
