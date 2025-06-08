package idk.pipidae.units;

public class Walk implements Action{
    public Walk(Title title){
        this.title = title;
    }

    public void perform(){
        System.out.println("walking..");
    }

    Title title;
}
