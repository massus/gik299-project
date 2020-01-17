
package icecream;

public class IceCream {
    private String id;
    private String type;
    private String brand;
    private double price;
    private int stock;
    private String flavour;
    private Boolean vegan;
    private Boolean allergenBesidesDairy;

    public IceCream(String id, String type, String brand, double price, int stock, String flavour, Boolean vegan, Boolean allergenBesidesDairy) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
        this.flavour = flavour;
        this.vegan = vegan;
        this.allergenBesidesDairy = allergenBesidesDairy;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductType() {
        return type;
    }

    public void setProductType(String productType) {
        this.type = productType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public Boolean getAllergenBesidesDairy() {
        return allergenBesidesDairy;
    }

    public void setAllergenBesidesDairy(Boolean allergenBesidesDairy) {
        this.allergenBesidesDairy = allergenBesidesDairy;
    }
    
    public String getPrintable() {
        return String.format("Id: %s.\n"
                + "Type: %s\n"
                + "Brand: %s\n"
                + "Price: %.2f kr\n"
                + "Stock: %d\n"
                + "Flavour: %s\n"
                + "Vegan: %b\n"
                + "Allergens: %b\n"
                + "----------------------------------------------------------\n", 
                getId(), getType(), getBrand(), getPrice(), getStock(), getFlavour(), getVegan(), getAllergenBesidesDairy());
    }
}