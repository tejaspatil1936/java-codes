// Define an enumeration for passenger types
enum Gender {
    MALE, FEMALE, SENIOR;
}

// Passenger class to encapsulate details about the passengers
class Passenger {
    private String name;
    private Gender gender;
    private int age;

    public Passenger(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}

// Abstract Bus class with enhanced fare calculation
abstract class Bus {
    private String routeName;
    private int totalSeats;
    private boolean[] seatsOccupied;
    private double baseFare;

    public Bus(String routeName, int totalSeats, double baseFare) {
        this.routeName = routeName;
        this.totalSeats = totalSeats;
        this.baseFare = baseFare;
        this.seatsOccupied = new boolean[totalSeats];
    }

    // Calculate fare based on passenger details
    public double calculateFare(Passenger passenger, int distance) {
        double fare = baseFare * distance;
        switch (passenger.getGender()) {
            case FEMALE:
                fare *= 0.5;
                break;
            case SENIOR:
                fare = 0;
                break;
            case MALE:
            default:
                break;
        }
        return fare;
    }

    public boolean reserveSeat(int seatNumber) {
        if (!seatsOccupied[seatNumber]) {
            seatsOccupied[seatNumber] = true;
            return true;
        } else {
            return false;
        }
    }

    public void cancelReservation(int seatNumber) {
        if (seatsOccupied[seatNumber]) {
            seatsOccupied[seatNumber] = false;
        }
    }

    public void displayBusInfo() {
        System.out.println("Route: " + routeName + " | Seats Available: " + getAvailableSeats());
    }

    private int getAvailableSeats() {
        int available = 0;
        for (boolean occupied : seatsOccupied) {
            if (!occupied) {
                available++;
            }
        }
        return available;
    }

    public String getRouteName() {
        return routeName;
    }
}

class RegularBus extends Bus {
    public RegularBus(String routeName, int totalSeats) {
        super(routeName, totalSeats, 10);
    }
}

class LuxuryBus extends Bus {
    private double comfortSurcharge;

    public LuxuryBus(String routeName, int totalSeats, double comfortSurcharge) {
        super(routeName, totalSeats, 15);
        this.comfortSurcharge = comfortSurcharge;
    }
}

// Main class to manage the bus reservation system
public class BusReservationSystem {
    public static void main(String[] args) {
        RegularBus bus101 = new RegularBus("City Center to Airport", 40);
        LuxuryBus bus102 = new LuxuryBus("City Center to Beach Resort", 30, 15.0);

        Passenger Tejas = new Passenger("Tejas Patil", Gender.MALE, 30);
        Passenger Shravani = new Passenger("Shravani Salunke", Gender.FEMALE, 25);
        Passenger grandparent = new Passenger("abc Grandparent", Gender.SENIOR, 75);

        bus101.reserveSeat(1);
        bus102.reserveSeat(2);

        System.out.println("Fare for Tejas (male, 30): rs" + bus101.calculateFare(Tejas, 10));
        System.out.println("Fare for Shravani (female, 25): rs" + bus102.calculateFare(Shravani, 10));
        System.out.println("Fare for abc Grandparent (senior, 75): rs" + bus101.calculateFare(grandparent, 10));
    }
}
