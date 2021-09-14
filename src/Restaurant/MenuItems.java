package Restaurant;

public class MenuItems {
    public static void main(String[] args) {
    }

    private String itemName;
    private Float itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean isNew;

    public MenuItems(String name, Float price, String description, String category, boolean isNew) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemDescription = description;
        this.itemCategory = category;
        this.isNew = isNew;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    private String newItem() {
        if(this.isNew) {
            return ("This is new.");
        } else {
            return ("This is not new.");
        }
    }
}
