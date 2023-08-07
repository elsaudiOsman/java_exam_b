import java.time.LocalDate;


class Ticket {
    private int id;
    private String showName;
    private LocalDate showDate;
    private int rowNumber;
    private int seatNumber;
    private Customer customer;
    private double ticketPrice;

    public Ticket(int id, String showName, LocalDate showDate, int rowNumber, int seatNumber, Customer customer, double ticketPrice) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.customer = customer;
        this.ticketPrice = ticketPrice;
    }

    public Ticket() {

    }

    public Ticket(int id, String concert, String s, int rowNumber, int seatNumber, Customer vipCustomer, double ticketPrice) {
    }

    public int getId() {
        return id;
    }

    public String getShowName() {
        return showName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }
    

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTicketPrice() {
        if (customer.getCustomerType() == CustomerType.VIP) {
            if (customer.getCustomerDiscount() != null) {
                return ticketPrice - customer.getCustomerDiscount();
            } else {
                throw new IllegalStateException("VIP customer must have a discount.");
            }
        } else {
            return ticketPrice;
        }
    }
}
