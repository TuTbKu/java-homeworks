package oop.library;

public class Penalty {
    int maxDays = 5;
    int curentDay;
    int penaltyDays;
    int penaltyPrise = 5555;

    public int getMaxDays() {
        return maxDays;
    }

    public void setMaxDays(int maxDays) {
        this.maxDays = maxDays;
    }

    public int getCurentDay() {
        return curentDay;
    }

    public void setCurentDay(int curentDay) {
        this.curentDay = curentDay;
    }

    public int getPenaltyDays() {
        return penaltyDays;
    }

    public void setPenaltyDays(int penaltyDays) {
        this.penaltyDays = penaltyDays;
    }

    public int getPenaltyPrise() {
        return penaltyPrise;
    }

    public void setPenaltyPrise(int penaltyPrise) {
        this.penaltyPrise = penaltyPrise;
    }
}