//==========================================================================================================
//  Refrigerator List Model
//==========================================================================================================

package ku.cs.models;

import java.util.ArrayList;

public class RefrigeratorList {
    ArrayList<Refrigerator> refrigeratorsList;

    public RefrigeratorList() {
        refrigeratorsList = new ArrayList<>();
    }

    public void addRefrigerator(Refrigerator refrigerator) {
        refrigeratorsList.add(refrigerator);
    }

    public ArrayList<Refrigerator> getAllRefrigerator(){
        return refrigeratorsList;
    }

    @Override
    public String toString() {
        return "RefrigeratorList{" +
                "refrigeratorsList=" + refrigeratorsList +
                '}';
    }
}

//==========================================================================================================
