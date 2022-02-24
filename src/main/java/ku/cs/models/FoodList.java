package ku.cs.models;

import java.util.ArrayList;

public class FoodList {
    private final ArrayList<Food> foods;

    public FoodList(){
        foods=new ArrayList<>();

    }
    public void addMaterials(Food material){
        foods.add(material);
    }

    public ArrayList<Food>getAllMaterials(){return foods;}


}
