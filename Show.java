import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Show {
    private int id;
    private String showName;
    private LocalDate showDate;
    private List<Ticket> tickets;

    public Show(int id, String showName, LocalDate showDate) {
        super();
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.tickets = new ArrayList<>();
    }

    public Show(int id, String concert, String s) {
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

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    public double calculateShowRevenue() {
        double revenue = 0;
        for (Ticket ticket : tickets) {
            revenue += ticket.getTicketPrice();
        }
        return revenue;
    }

    public double calculateTotalDiscount() {
        double totalDiscount = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getCustomer().getCustomerType() == CustomerType.VIP) {
                if (ticket.getCustomer().getCustomerDiscount() != null) {
                    totalDiscount += ticket.getCustomer().getCustomerDiscount();
                }
            }
        }
        return totalDiscount;
    }
}