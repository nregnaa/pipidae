
public class Order{
    public Order(TitleRank orderRank, Action action){
        this.orderRank=orderRank;
        this.action=action;
    };
    
    public TitleRank getOrderRank(){
        return orderRank;
    };
    
    public Action getAction(){
        return action;
    };
    
    //rank of the order dictates how important it is. The variable derives from the rank of its issuer.
    //Need.urgency equivalent.
    private TitleRank orderRank;
    private Action action;
};
