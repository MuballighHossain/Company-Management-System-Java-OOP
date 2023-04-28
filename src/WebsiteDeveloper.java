public class WebsiteDeveloper extends Office{
    private double incomerPerProject;
    WebsiteDeveloper(int c,double i){
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
        return "WebsiteDeveloper will get "+salary()+" dollar";
    }
}
