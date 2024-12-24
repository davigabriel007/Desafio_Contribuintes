public class TaxPayer {
    private double salaryIncome;
    private double serviceIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer(double salaryIncome, double capitalIncome, double serviceIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = (salaryIncome / 12);
        this.capitalIncome = capitalIncome;
        this.serviceIncome = serviceIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
        double spending = this.healthSpending + this.educationSpending;
    }

    public double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public double getServiceIncome() {
        return serviceIncome;
    }

    public void setServiceIncome(double serviceIncome) {
        this.serviceIncome = serviceIncome;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public double salaryTax(double salaryIncome) {
        double salaryTax = salaryIncome * 12;
        if (salaryIncome < 3000) {
            salaryTax = 0;
            return salaryTax;
        } else if (salaryIncome > 3000 && salaryIncome < 5000) {
            salaryTax = (salaryTax * 0.1);
            return salaryTax;
        } else {
            salaryTax = (salaryTax * 0.2);
            return salaryTax;
        }

    }

    public double servicesTax(double serviceIncome) {
        if (serviceIncome > 0) {
            return serviceIncome * 0.15;
        } else {
            return 0;
        }
    }

    public double capitaltaxTax(double capitalIncome) {
        if (capitalIncome > 0) {
            return capitalIncome * 0.2;
        } else {
            return 0;
        }
    }

    public double grossTax() {
        return salaryTax(this.salaryIncome) + servicesTax(this.serviceIncome) + capitaltaxTax(this.capitalIncome);
    }

    public double taxRebate() {
        double grossTax = grossTax();
        double spending = healthSpending + educationSpending;
        double rebate = grossTax * 0.3;

        if (grossTax > spending) {
            return spending;
        } else {
            return rebate;
        }

    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

}

