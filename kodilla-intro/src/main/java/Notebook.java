public class Notebook {
    public final int year;
    int price;
    int weight;

    public Notebook(int weight, int price, int year) {
        this.price = price;
        this.weight = weight;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("The notebook is expensive.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is light");
        } else if (this.weight > 600 && this.weight < 1600) {
            System.out.println("The notebook is quite heavy");
        } else if (this.weight > 1600) {
            System.out.println("This notebook is heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year > 2008 && this.price < 1500) {
            System.out.println("This laptop is old and cheap");
        } else if (this.year < 2008 && this.price > 1500) {
            System.out.println("This laptop is old and not cheap");
        } else if (this.year < 2015 && this.price > 2000) {
            System.out.println("This laptop is new and expensive");
        } else {
            System.out.println("This laptop is new and expensive");
        }
    }
}