

import java.util.ArrayList;
import java.util.Date;

public class Campaign {
    private String name;
    private String description;
    private ArrayList<Purchasable> AppliedToThings;    // keeps list of things which this campaign is applicable for
    private double amountOfDiscountInPercentage;
    private Date startDate;
    private Date endDate;

    public Campaign(String name, String description,  double amountOfDiscountInPercentage) {
        this.name = name;
        this.description = description;
        AppliedToThings = new ArrayList<Purchasable>();
        this.amountOfDiscountInPercentage = amountOfDiscountInPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Purchasable> getAppliedToThings() {
        return AppliedToThings;
    }

    public void setAppliedToThings(ArrayList<Purchasable> appliedToThings) {
        this.AppliedToThings = appliedToThings;
    }

    public double getAmountOfDiscountInPercentage() {
        return amountOfDiscountInPercentage;
    }

    public void setAmountOfDiscountInPercentage(double amountOfDiscountInPercentage) {
        this.amountOfDiscountInPercentage = amountOfDiscountInPercentage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +

                '}';
    }
}
