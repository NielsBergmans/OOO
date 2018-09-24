package domain;

public class Shop {

    private ProductDB productDB;

    public Shop(){
        productDB = new ProductDB();
    }

    public void addProduct(String title, String id, String type){
        Product p = null;
        if (type.equals("M")){
            p = new Movie(id,title);
        }
        if (type.equals("G")){
            p = new Game(id,title);
        }
        productDB.addProduct(p);
    }

    public String getProductTitle(String id){
        return this.productDB.getProductById(id).getTitle();
    }

    public double getPrize(String id,int nrOfDays){
        return this.productDB.getProductById(id).getPrice(nrOfDays);
    }


}
