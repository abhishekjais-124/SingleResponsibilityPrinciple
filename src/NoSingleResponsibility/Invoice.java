package NoSingleResponsibility;

// This class has 3 reasons to change, but the single responsibility principle says that there should be only one reason to change the class

public class Invoice {

    int quantity;
    Pen pen;

    public Invoice(int quantity, Pen pen) {
        this.quantity = quantity;
        this.pen = pen;
    }

    public int calculateTotalPrice(){  //reason 1
        return this.quantity* pen.price;
    }

    public void printInvoice(){} // reason 2

    public void SaveToDB(){} // reason 3

}
