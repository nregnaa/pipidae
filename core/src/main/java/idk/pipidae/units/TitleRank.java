package idk.pipidae.units;

public enum TitleRank{
    PEASENT(0), KNIGHT(1), BARON(2), COUNT(3), DUKE(4), KING(5);
    
    public TitleRank(int rank){
        this.rank=rank;
    }
    
    public void getRank(){
        return rank;
    }
    
    private final int rank;
}
