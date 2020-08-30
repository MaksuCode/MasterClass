package practice;

public class CarSimple {

    private int doors ;
    private int wheels ;
    private String model ;
    private String engine ;

    public void setModel(String model){ // We can make some validation inside the setter methods.
        String validModel = model.toLowerCase() ;
        if (validModel.equals("carrera") || validModel.equals("comodore")){
            this.model = model ;
        }else{
            this.model = "Unknown" ;
        }
    }

    public String getModel() {
        return this.model ;
    }
}
