public class program_61_showroom_encapsulation {
    static class Showroom {
        private int id;
        private String vehicleName;
        private double amount;
        private String branch;

        void setId(int id) {
            this.id = id;
        }

        void setVehicleName(String vehicleName) {
            this.vehicleName = vehicleName;
        }

        void setBranch(String branch) {
            this.branch = branch;
        }

        void setAmount(double amount) {
            this.amount = amount;
        }

        int getId() {
            return id;
        }

        String getVehicleName() {
            return vehicleName;
        }

        String getBranch() {
            return branch;
        }

        double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {
        Showroom s = new Showroom();

        s.setId(6966969);
        s.setVehicleName("Honda");
        s.setBranch("Automobile");
        s.setAmount(6999999);

        System.out.println("ID : " + s.getId());
        System.out.println("Name : " + s.getVehicleName());
        System.out.println("Branch : " + s.getBranch());
        System.out.println("Amount : " + s.getAmount());
    }
}
