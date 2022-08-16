public class Circle {

    private Double radius;

    public Double getCircumfrence(){
        return 2*radius*Math.PI;
    }

    public void setCircumfrence(Double newCircumfrence){
        this.radius = newCircumfrence;
    }

}
