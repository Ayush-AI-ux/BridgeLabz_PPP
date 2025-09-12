public class CarRentalTest {
    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Alice", "SUV", 5);
        System.out.println("\nCarRental1 -> " + cr1.getCustomerName() + " rented " + cr1.getCarModel() +
                           " for " + cr1.getRentalDays() + " days, Cost: " + cr1.getTotalCost());
        System.out.println("CarRental2 -> " + cr2.getCustomerName() + " rented " + cr2.getCarModel() +
                           " for " + cr2.getRentalDays() + " days, Cost: " + cr2.getTotalCost());
    }
}

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this("Unknown", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private double calculateTotalCost() {
        double dailyRate = carModel.equalsIgnoreCase("SUV") ? 2000 : 1500;
        return rentalDays * dailyRate;
    }

    public double getTotalCost() {
        return calculateTotalCost();
    }

    public String getCustomerName() { return customerName; }
    public String getCarModel() { return carModel; }
    public int getRentalDays() { return rentalDays; }
}