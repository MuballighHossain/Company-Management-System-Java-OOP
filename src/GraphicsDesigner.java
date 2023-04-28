public class GraphicsDesigner extends Office{
    private double incomerPerProject;
    GraphicsDesigner(int c,double i){
        super(c);
        incomerPerProject=i;
    }
    public double salary(){
        return projectCount*incomerPerProject;
    }
    public void setRating(double i){
        incomerPerProject=i;
    }
    public String toString(){
        return "GraphicsDesigner will get "+salary()+" dollar";
    }
}
