public class SearchEngineOptimizer extends Office{
    private double incomerPerProject;
    SearchEngineOptimizer(int c,double i){
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
        return "SearchEngineOptimizer will get "+salary()+" dollar";
    }
}

