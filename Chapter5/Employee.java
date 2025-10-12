class Employee {
    private int empNum;
    private double rate;
    final double OVERTIME_RATE = 1.5;

    public Employee(int num, double rate) {
        empNum = num;
        this.rate = rate;
    }
    double getRegularPay(double hrs) {
        if (hrs > 40)
            return 40 * rate;
        else
            return hrs * rate;
    }

    double getOvertimePay(double hrs) {
        if (hrs > 40) {
            double ot = hrs - 40;
            return ot * rate * OVERTIME_RATE;
        } else
            return 0;
    }
}
