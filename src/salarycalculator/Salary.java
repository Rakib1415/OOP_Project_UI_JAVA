
package salarycalculator;

public class Salary {
    public String employeeName;
    public double basicAmount;
    public double houseRentPercentage;
    public double medicalAllowancePercentage;
    
    public double getHouseRentAmount(){
        return (basicAmount / 100) * this.houseRentPercentage;
    }
    
    public double getMedicalAllowanceAmount(){
        return (basicAmount / 100) * this.medicalAllowancePercentage;
    }
    
    public double getTotalSalary(){
        return this.basicAmount + this.getHouseRentAmount() + this.getMedicalAllowanceAmount();
    }
}
