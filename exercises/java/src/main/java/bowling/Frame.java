package bowling;

public class Frame {

    int roll1;
    int roll2;
    Integer total;

    public Frame(int roll1, int roll2) {
        this.roll1 = roll1;
        this.roll2 = roll2;
    }

    public Integer getTotal(){
        return this.total = roll1 + roll2;
    }
}
