class Customer implements FoodVoucher {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Double customerDiscount;
    private FoodVoucher foodVoucher;

    public Customer(int id, String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, Double customerDiscount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    public void takeFoodVoucher(FoodVoucher foodVoucher) {
        this.foodVoucher = foodVoucher;
    }

    public void eatFood() {
        if (foodVoucher != null) {
            foodVoucher.eat();
        } else {
            System.out.println("No food voucher available.");
        }
    }

    @Override
    public void eat() {

    }
}