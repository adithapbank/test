package ku.cs.models;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Food {
    private String foodName;
    private String foodMeasure;
    private String foodCategory;
    private int foodAmount;
    private int foodSlot;
    private int upToDate;
    private String foodImagePath;
    private LocalDate foodExpiredDate;

    public Food(String foodCategory, int foodSlot) {
        this.foodName = "null";
        this.foodMeasure = "null";
        this.foodCategory = foodCategory;
        this.foodSlot = foodSlot;
        this.foodAmount = 0;
        this.upToDate = 1;
        this.foodImagePath = "null";
        this.foodExpiredDate = null;
    }

    public Food(String foodName, String foodMeasure, String foodCategory, int foodSlot, int foodAmount, int upToDate, String foodImagePath, LocalDate foodExpiredDate) {
        this.foodName = foodName;
        this.foodMeasure = foodMeasure;
        this.foodCategory = foodCategory;
        this.foodSlot = foodSlot;
        this.foodAmount = foodAmount;
        this.upToDate = upToDate;
        this.foodImagePath = foodImagePath;
        this.foodExpiredDate = foodExpiredDate;
    }

    public Food(String foodName, String foodMeasure, String foodCategory, int foodSlot, int foodAmount, int upToDate, String foodImagePath, int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        this.foodName = foodName;
        this.foodMeasure = foodMeasure;
        this.foodCategory = foodCategory;
        this.foodSlot = foodSlot;
        this.foodAmount = foodAmount;
        this.upToDate = upToDate;
        this.foodImagePath = foodImagePath;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodMeasure() {
        return foodMeasure;
    }

    public int getDay() {
        return foodExpiredDate.getDayOfMonth();
    }

    public int getMonth() {
        return foodExpiredDate.getMonthValue();
    }

    public int getYear() {
        return foodExpiredDate.getYear();
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public int getFoodSlot() {
        return foodSlot;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public int getUpToDate() {
        return upToDate;
    }

    public void setUpToDate(int upToDate) {
        this.upToDate = upToDate;
    }

    public String getFoodImagePath() {
        return foodImagePath;
    }

    public LocalDate getFoodExpiredDate() {
        return foodExpiredDate;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodMeasure(String foodMeasure) {
        this.foodMeasure = foodMeasure;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public void setFoodSlot(int foodSlot) {
        this.foodSlot = foodSlot;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void setFoodImagePath(String foodImagePath) {
        this.foodImagePath = foodImagePath;
    }

    public void setFoodExpiredDate(LocalDate foodExpiredDate) {
        this.foodExpiredDate = foodExpiredDate;
    }

    public void addFood(int foodAmount) {
        this.foodAmount += foodAmount;
    }

    public void removeFood(int foodAmount) {
        this.foodAmount -= foodAmount;
    }

    public int compareExpired(ChronoLocalDate other) {
        return foodExpiredDate.compareTo(other);
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", foodMeasure='" + foodMeasure + '\'' +
                ", foodAmount=" + foodAmount +
                ", foodCategory=" + foodCategory +
                ", foodSlot=" + foodSlot +
                ", foodImagePath='" + foodImagePath + '\'' +
                ", foodExpiredDate=" + foodExpiredDate +
                '}';
    }
}