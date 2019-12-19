package supermarket.entity;

import java.io.Serializable;

public class Supplier_Entity implements Serializable {
    private String supplierno;      //供应商号
    private String suppliername;    //供应商名称
    private String suppliermanager; //法人代表
    private String suppliercontact; //联系人
    private String suppliercontactphone;//联系人电话
    private String supplieraddress; //地址

    public String getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(String supplierno) {
        this.supplierno = supplierno;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSuppliermanager() {
        return suppliermanager;
    }

    public void setSuppliermanager(String suppliermanager) {
        this.suppliermanager = suppliermanager;
    }

    public String getSuppliercontact() {
        return suppliercontact;
    }

    public void setSuppliercontact(String suppliercontact) {
        this.suppliercontact = suppliercontact;
    }

    public String getSuppliercontactphone() {
        return suppliercontactphone;
    }

    public void setSuppliercontactphone(String suppliercontactphone) {
        this.suppliercontactphone = suppliercontactphone;
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress;
    }

    @Override
    public String toString() {
        return "Supplier_Entity{" +
                "supplierno='" + supplierno + '\'' +
                ", suppliername='" + suppliername + '\'' +
                ", suppliermanager='" + suppliermanager + '\'' +
                ", suppliercontact='" + suppliercontact + '\'' +
                ", suppliercontactphone='" + suppliercontactphone + '\'' +
                ", supplieraddress='" + supplieraddress + '\'' +
                '}';
    }
}
