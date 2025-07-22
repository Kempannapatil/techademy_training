package day3oops;

public class SalesSystemoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SaleItem[] items= {new SaleItem("laptop",50000,1),new SaleItem("Mouse",500,2),new SaleItem("Keboard",1000,1)};
    
     double grandTotal=0;
     
     System.out.println("Product\tPrice\tQty\tTotal");
     System.out.println("___________________________");
     for(SaleItem item:items) {
    	 item.displayItem();
    	 grandTotal+=item.getTotalPrice();
     }
     System.out.println("________________________________");
     System.out.println("Grand Total: "+grandTotal);
    }
   }


