import java.util.Date;
public class Credit {
    private String description;
    private double value;
    private Date creditDate;

    public Credit(String description, Double value){
        this.description = description;
        this.value = value;
        this.creditDate = new Date();
    }

    public String getDescription(){
        return description;
    }

    public double getValue(){
        return value;
    }

    public Date getCreditDate (){
        return creditDate;
    }
}