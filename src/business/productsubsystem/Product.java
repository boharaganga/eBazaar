
package business.productsubsystem;

import business.externalinterfaces.IProductFromDb;
import business.externalinterfaces.IProductFromGui;


class Product implements IProductFromDb, IProductFromGui {

    private String productId;
    private String productName;
    private String quantityAvail;
    private String unitPrice;
    private String mfgDate;
    private String catalogId;
    private String description;
    
    //this is the usual constructor, obtained when reading a product from the db
    Product(String pi, String pn, String qa, String up, String md, String ci, String d){
        productId=pi;
        productName = pn;
        quantityAvail = qa;
        unitPrice = up;
        mfgDate = md;
        catalogId = ci;
        description = d;
    }
    //this constructor is used when getting user-entered data in adding a new product
    Product(String name, String date, String numAvail, String price){
    	this(null, name, numAvail, price, date, null, null);
    }
    /**
     * @return Returns the catalogId.
     */
    public String getCatalogId() {
        return catalogId;
    }
    /**
     * @return Returns the mfgDate.
     */
    public String getMfgDate() {
        return mfgDate;
    }
    /**
     * @return Returns the productId.
     */
    public String getProductId() {
        return productId;
    }
    /**
     * @return Returns the productName.
     */
    public String getProductName() {
        return productName;
    }
    /**
     * @return Returns the quantityAvail.
     */
    public String getQuantityAvail() {
        return quantityAvail;
    }
    /**
     * @return Returns the unitPrice.
     */
    public String getUnitPrice() {
        return unitPrice;
    }
    /**
     * @return Returns the description.
     */
    public String getDescription() {
        return description;
    }
}
