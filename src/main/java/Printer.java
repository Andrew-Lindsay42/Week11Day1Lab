public class Printer {
    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }

    public int getPaper(){
        return this.paper;
    }

    public void print(int pages, int copies){
        if (this.paper >= pages * copies) {
            this.paper -= (pages * copies);
        }
    }
}
