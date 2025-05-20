import java.util.ArrayList;
import java.util.List;

// Zoo class representing a zoo with animals
public class Zoo {
    // Private instance variables
    private int numOfAnimals;
    private String name;
    private List<Enclosure> enclosures; // List of enclosures in the zoo
    private Gate gate; // The gate object for the zoo
    
    // Constructor to initialize the instance variables
    public Zoo(String name) {
        this.name = name;
        this.numOfAnimals = 0;
        this.enclosures = new ArrayList<>();
        this.gate = new Gate();
    }
    
    // Method to add an enclosure to the zoo
    public void addEnclosure(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }
    
    // Method to list all the enclosures in the zoo
    public void listEnclosures() {
        System.out.println("Enclosures in the " + this.name + " zoo:");
        for (Enclosure enclosure : this.enclosures) {
            System.out.println("- " + enclosure.toString());
        }
    }
    
    // Method to count the total number of animals in the zoo
    public int countAnimals() {
        int count = 0;
        for (Enclosure enclosure : this.enclosures) {
            count += enclosure.getNumOfAnimals();
        }
        this.numOfAnimals = count;
        return count;
    }
    
    // Enclosure class representing an enclosure in the zoo
    private class Enclosure {
        // Private instance variables
        private String foodType;
        private List<String> animals; // List of animals in the enclosure
        
        // Constructor to initialize the instance variables
        public Enclosure(String foodType) {
            this.foodType = foodType;
            this.animals = new ArrayList<>();
        }
        
        // Method to add an animal to the enclosure
        public void addAnimal(String animal) {
            this.animals.add(animal);
        }
        
        // Method to change an animal in the enclosure
        public void changeAnimal(String oldAnimal, String newAnimal) {
            int index = this.animals.indexOf(oldAnimal);
            if (index != -1) {
                this.animals.set(index, newAnimal);
            }
        }
        
        // Method to get the number of animals in the enclosure
        public int getNumOfAnimals() {
            return this.animals.size();
        }
        
        // Method to get the food type for the enclosure
        public String getFoodType() {
            return this.foodType;
        }
        
        // Override toString method to print the enclosure details
        public String toString() {
            return "Enclosure with " + this.getNumOfAnimals() + " " + this.foodType + " eating animals";
        }
    }
    
    // Gate class representing the entrance gate of the zoo
    private static class Gate {
        // Private instance variables
        private boolean isOpen;
        
        // Constructor to initialize the instance variables
        public Gate() {
            this.isOpen = false;
        }
        
        // Method to open the gate
        public void openGate() {
            this.isOpen = true;
        }
        
        // Method to close the gate
        public void closeGate() {
            this.isOpen = false;
        }
    }
}
