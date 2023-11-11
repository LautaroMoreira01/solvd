package classes;

public class Sale {
    private Product product;
    private Integer quantity;

    public Sale( Integer quantity , Product product){
        //this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

  //  public Long getId() {
    //    return id;
    //}
}
