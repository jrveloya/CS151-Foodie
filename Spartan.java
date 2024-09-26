package Foodie;

import java.util.ArrayList;

public class Spartan extends User{
	private int placesVisited;
	ArrayList<foodPreferences> foodPref = new ArrayList<>();
	

	public Spartan() {
		this.setUserID(null);
		this.foodPref.replaceAll(null);
		this.placesVisited = 0;
		//what more do we need? 
	}
	public Spartan(String userName, String password, foodPreferences[] foodiePref) {
	}
	public int getPlacesVisited() {
		return placesVisited;
	}

	public void setPlacesVisited(int placesVisited) {
		this.placesVisited = placesVisited;
	}

	public ArrayList<foodPreferences> getFoodPref() {
		return foodPref;
	}

	public void setFoodPref(ArrayList<foodPreferences> foodPref) {
		this.foodPref = foodPref;
	}
	
	public void addPreference(foodPreferences fp) {
		if(this.foodPref.contains(fp)) {
			System.out.println("Already added! Try again.");
		}else {
			this.foodPref.add(fp);
		}
	}
}
