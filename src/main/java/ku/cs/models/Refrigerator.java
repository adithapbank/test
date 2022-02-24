//==========================================================================================================
//  Refrigerator Model
//==========================================================================================================

package ku.cs.models;

import java.time.LocalDate;

public class Refrigerator {
    private int refrigeratorSlot;
    private int foodAmount;
    private String latestFood;
    private LocalDate foodExpiredAmount;

    public Refrigerator(int foodAmount, String latestFood, LocalDate foodExpiredAmount) {
        this.refrigeratorSlot = 6;
        this.foodAmount = foodAmount;
        this.latestFood = latestFood;
        this.foodExpiredAmount = foodExpiredAmount;
    }

    public Refrigerator(int refrigeratorSlot, int foodAmount, String latestFood, int year, int month, int day) {
        LocalDate localdate =  LocalDate.of(year, month, day);
        this.refrigeratorSlot = refrigeratorSlot;
        this.latestFood = latestFood;
        this.foodAmount = foodAmount;
    }

    public int getYear() {
        return foodExpiredAmount.getYear();
    }

    public int getMonth() {
        return foodExpiredAmount.getMonthValue();
    }

    public int getDay() {
        return foodExpiredAmount.getDayOfMonth();
    }

    public int getRefrigeratorSlot() {
        return refrigeratorSlot;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public LocalDate getFoodExpiredAmount() {
        return foodExpiredAmount;
    }

    public String getLatestFood() {
        return latestFood;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "slot=" + refrigeratorSlot +
                ", foodAmount=" + foodAmount +
                ", foodExpiredAmount=" + foodExpiredAmount +
                '}';
    }
}

//==========================================================================================================
