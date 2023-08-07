import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
       // System.out.println("osman");

        Customer vipCustomer = new Customer(1, "Osman", "Elsaudi", "oelsaudi80@gmail.com", "123 Tel Aviv", CustomerType.VIP, 20.0);


        Show show = new Show(1, "Concert", "2023-08-07");

        Ticket vipTicket = new Ticket(1, "Concert", "2023-08-07", 1, 1, vipCustomer, 100.0);
        show.addTicket(vipTicket);

        System.out.println("Show Name: " + show.getShowName());
        System.out.println("Show Date: " + show.getShowDate());
        System.out.println("Show Revenue: $" + show.calculateShowRevenue());
        System.out.println("Total VIP Discount: $" + show.calculateTotalDiscount());

        FoodVoucher foodVoucher = () -> System.out.println("Here is your food, enjoy!");

        vipCustomer.takeFoodVoucher(foodVoucher);
        vipCustomer.eatFood();

    }
}