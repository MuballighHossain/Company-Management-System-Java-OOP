import java.util.Scanner;
public class CEO{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        WebsiteDeveloper        k=new WebsiteDeveloper(4,60000);

        GraphicsDesigner        v=new GraphicsDesigner(4,90000);

        VideoEditor             g=new VideoEditor(4,80000);

        BackEndDeveloper        d=new BackEndDeveloper(4, 70000);

        SearchEngineOptimizer   b=new SearchEngineOptimizer(4,100000);

        Office [] members={v,g,k,d,b};
        for(int i=0;i<members.length;i++){
            System.out.println(members[i]);
            System.out.println("If u want to increase the salary, press 1 otherwise press any other number");
            if(sc.nextInt()==1){
                System.out.println("Drop the new salary per concert");
                members[i].setRating(sc.nextDouble());
                System.out.println("After adjusting, "+members[i]+"\n");
            }
        }
        System.out.println("Finally,");
        for(int i=0;i<members.length;i++){
            System.out.println(members[i]);
        }
    }
}
