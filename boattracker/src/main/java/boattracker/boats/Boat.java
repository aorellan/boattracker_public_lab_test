package boattracker.boats;
import java.util.ArrayList;
import boattracker.internal.*;
public class Boat {
    private String modelNumber;
    private String boatColor;
    private double boatPri
    private ArrayList<Employee> users = new ArrayList<Employee>();

     
    public Boat(String modelNumber){
        this.modelNumber = modelNumber;
    }

    public String getBoatColor() {
        return boatColor;
    }
 
    public double getBoatPrice() {
     

     
    public void addUser(Employee employee){
        this.users.add(employee);
    }

    public void removeUser(Employee employee){
	this.users.remove(employee);
    }

}
