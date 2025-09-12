public class HotelBookingTest {
    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking hb3 = new HotelBooking(hb2); // copy
        System.out.println("\nHotelBooking1 -> " + hb1.getGuestName() + ", " + hb1.getRoomType() + ", Nights: " + hb1.getNights());
        System.out.println("HotelBooking2 -> " + hb2.getGuestName() + ", " + hb2.getRoomType() + ", Nights: " + hb2.getNights());
        System.out.println("HotelBooking3 (copy) -> " + hb3.getGuestName() + ", " + hb3.getRoomType() + ", Nights: " + hb3.getNights());
    }   
}

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public String getGuestName() { return guestName; }
    public String getRoomType() { return roomType; }
    public int getNights() { return nights; }
}
