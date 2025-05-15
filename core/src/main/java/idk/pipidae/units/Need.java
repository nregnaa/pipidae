package idk.pipidae.units;

public class Need{
    public Need(int urgency){ // TODO: Skal action også i constructor?
        this.urgency=urgency;
        this.action=action;
    }
    
    public int getUrgency(){
        return urgency;
    }

    public Action getAction(){
        return action;
    }

    //Order.orderRank equivalent, which will be used in part to evaluate which action is best.
    //Denotes how important this action is.
    private int urgency;
    private Action action;
}
