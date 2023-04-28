public class VideoEditor extends Office{
    private double incomerPerProject;
    VideoEditor(int c,double i){
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
        return "VideoEditor will get "+salary()+" dollar";
    }
}
