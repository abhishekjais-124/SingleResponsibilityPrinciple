package SingleResponsibility;

// Every class has only one reason to change
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

}
