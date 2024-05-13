package objects;

import java.util.ArrayList;

public class Market {
  private ArrayList<Stock> stocks = new ArrayList<>();
  
  public Market() {
    // do nothing
  }

  //===============>>
  // GETTERS
  public Stock getStock(int idx) {
    return stocks.get(idx);
  }
  public ArrayList<Stock> getStocks() {
    return this.stocks;
  } // getStocks()

  public boolean buyStocks(Stock stock, int qty, double balance) {
    boolean purchaseSuccessful = false;
    double purchaseAmount = stock.getPrice() * qty;
    if(purchaseAmount <= balance) { 
      purchaseSuccessful = !purchaseSuccessful;
    }
    return purchaseSuccessful;
  } // buyStocks()

  //===============>>
  // SETTERS
  public void setStocks(ArrayList<Stock> stocks) {
    this.stocks = stocks;
  } // setStocks()

  public void addStock(Stock stock) {
    this.stocks.add(stock); // adds a new stock to the stocks
  } // addStock()

  //================>> sellStock

  public void sellStock(String stockSymbol, int quantity) {
  boolean found = false;
  for (int i = 0; i < stocks.size(); i++) {
   Stock stock = stocks.get(i);
    if (stock.getSymbol().equals(stockSymbol) && stock.getQuantity() >= quantity) {
   double saleAmount = stock.getPrice() * quantity; 
  balance += saleAmount;
 stock.sell(quantity);       
}










} // class