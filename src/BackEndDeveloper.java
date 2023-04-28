public class BackEndDeveloper extends Office{
    private double incomerPerProject;
    BackEndDeveloper(int c,double i){
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
        return "BackEndDeveloper will get "+salary()+" dollar";
    }
}
