package homework;

public class Printer {

    /**
     * Build a printer
     * User can set toner level range between 0 to 100 (toner level cannot be greater than 100)
     * User should be able to see number of page printed
     * User should be able to print both sided (Note: in that case printed page should calculated correctly)
     * User can view current toner level at anytime
     * single page == single toner level; (Example: Toner = 100, printed page = 20, updated toner = 80)
     * If toner reaches < 1, then print "Low Toner, Please add more toner"
     * Max pages can be printed == 100;
     */

    public String name;
    public int tonerLevel;
    public int lowToner;
    public int bothSide;
    public int page;
    public int toner;

    public void printSummary() {

        System.out.println("Name : " + this.name);
        System.out.println("Toner level : " + this.tonerLevel);
        System.out.println("Low toner, add toner: " + this.lowToner);
        System.out.println("Both side : " + this.bothSide +" pages");
        System.out.println("One page : " +this.page);
        System.out.println("One toner : " +this.toner);
    }

    public void setDetails(String name, int tonerLevel, int lowToner, int bothSide,
                           int page, int toner)
    {
        this.name = name;
        this.tonerLevel = tonerLevel;
        this.lowToner = lowToner;
        this.bothSide = bothSide;
        this.page = page;
        this.toner = toner;
    }


    //tried to set one page = one toner

    public void onePageOneToner(int page, int toner){
        this.page = this.toner;

    }


    //one page printed, toner level goes down

    public void onePagePrinted(int page){
        this.tonerLevel -= page;

    }


    //tried to set both side = 2 page and toner level goes down also

    public void pageCount(int bothSide){
        this.tonerLevel -= bothSide;
    }


    //tried to set toner level

    public void pagePrinted(int tonerLevel) {
        this.tonerLevel -= tonerLevel;

    }


    }












