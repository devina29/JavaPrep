/**
 * We will use this class to understand what is constructor
 */
public class Car {
 String modelName;
 String carLicenseNo;
 private int engineNo;
 private String ownerName;
 int topSpeed;
 int price;

 /**
  * Default constructor
  */
Car() {

}
/**
 * my special constructor
 */
Car(String ownerName) {
 this.ownerName = ownerName;

}

 public String getOwnerName() {
  return this.ownerName;
 }
 public void setOwnerName(String ownersName) {
  this.ownerName = ownersName;
 }
}
