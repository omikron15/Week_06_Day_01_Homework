public class Printer {

    private int paperVolume;
    private int tonerVolume;

    public Printer(int paperVolume, int tonerVolume){
        this.paperVolume = paperVolume;
        this.tonerVolume = tonerVolume;
    }

    public int paperVolume(){
        return this.paperVolume;
    }

    public int tonerVolume() {
        return this.tonerVolume;
    }

    public void print(int pages, int copies){
        int total_pages = (pages * copies);
        if ((total_pages < this.paperVolume)&&(total_pages < this.tonerVolume)){
            this.paperVolume -= total_pages;
            this.tonerVolume -= total_pages;
        }
    }

    public void refill(int pages){
        this.paperVolume += pages;
    }
}

