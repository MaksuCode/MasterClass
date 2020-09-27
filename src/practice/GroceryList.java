package practice;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList <String> groceryList = new ArrayList<String>() ;

    public static void main(String[] args) {

    }

    public void addItem (String item) {
        groceryList.add(item) ;
    }

    public void printGroceryList () {
        System.out.println("You have " + groceryList.size() + " items.");
        for (int i = 0 ; i < groceryList.size() ; i++) {
            System.out.println((i+1) + ". Element is : " + groceryList.get(i) );
        }
    }

    public void modifyGroceryItem (int position , String newItem) {
        groceryList.set(position , newItem) ;
        System.out.println((position+1) + ". item has been modified.");
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position) ;
    }

    public String findGroceryItem (String searchedItem) {
//        boolean exists = groceryList.contains(searchedItem) ;
        int position = groceryList.indexOf(searchedItem) ;
        if (position >= 0 ) {
            return groceryList.get(position) ;
        }
        return null;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void processArrayList () {
        ArrayList<String> newArrayList = new ArrayList<>() ;
        newArrayList.addAll(getGroceryList()) ;

        ArrayList<String> nextArrayList = new ArrayList<>(getGroceryList()) ;



    }


}
