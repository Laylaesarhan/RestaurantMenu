package Restaurant;

public class MenuItems {
    public static void main(String[] args) {}

    private Float itemPrice;
    private String itemDescription;
    private String itemCategory;

        public MenuItems (Float price, String description, String category) {
            this.itemPrice = price;
            this.itemDescription = description;
            this.itemCategory = category;
        }
        public Float getItemPrice () {
            return this.itemPrice;
        }
        public void setItemPrice (Float aPrice) {
            this.itemPrice = aPrice;
    }
        public String getItemDescription () {
        return this.itemDescription;
    }
        public void setItemDescription (String aDescription) {
        this.itemDescription = aDescription;
    }
        public String getItemCategory () {
        return this.itemCategory;
    }
        public void setItemCategory (String aCatergory) {
        this.itemCategory = aCatergory;
    }
}
