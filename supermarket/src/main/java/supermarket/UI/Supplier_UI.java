package supermarket.UI;

import supermarket.entity.Supplier_Entity;
import supermarket.service.Supplier_Service;

import java.util.List;
import java.util.Scanner;

public class Supplier_UI {
    Scanner reader = new Scanner(System.in);
    private Supplier_Service service = new Supplier_Service();

    /**
     * 显示用户账号（查）
     */
    public void showsupplier(){   //显示所有供应商
        List<Supplier_Entity> list = service.queryAll();
        for (Supplier_Entity e: list
                ) {
                System.out.println(e);
        }
    }

    /**
     * 插入用户收营员账号（增）
     */
    public void add_supplier(){    //增加
        Supplier_Entity supplier = new Supplier_Entity();

        System.out.println("请输入供应商编号:");
        supplier.setSupplierno(reader.next());

        System.out.println("请输入供应商名称:");
        supplier.setSuppliername(reader.next());

        System.out.println("请输入法人代表:");
        supplier.setSuppliermanager(reader.next());

        System.out.println("请输入联系人:");
        supplier.setSuppliercontact(reader.next());

        System.out.println("请输入联系人电话:");
        supplier.setSuppliercontactphone(reader.next());

        System.out.println("请输入供应商地址:");
        supplier.setSupplieraddress(reader.next());

        int a = service.addSupplier(supplier);
        String str = a>0?"添加成功":"添加失败";
        System.out.println(str);
    }

    /**
     * 用户账号删除
     */
    public  void del_supplier(){   //删
        System.out.println("请输入要删除账户的用户编号:");
        int b = service.delSupplier(reader.next());
        String str = b>0?"删除成功":"删除失败";
        System.out.println(str);
    }

    /**
     * 用户账号修改
     */
    public void update_supplier(){   //改
        System.out.println("请输入供应商编号:");
        String supplierno = reader.next();

        System.out.println("请输入供应商名称:");
        String suppliername = reader.next();

        System.out.println("请输入法人代表:");
        String suppliermanager = reader.next();

        System.out.println("请输入联系人:");
        String suppliercontact = reader.next();

        System.out.println("请输入联系人电话:");
        String suppliercontactphone = reader.next();

        System.out.println("请输入供应商地址:");
        String supplieraddress = reader.next();

        List<Supplier_Entity> list = service.queryAll();
        for (Supplier_Entity e: list
                ) {
            if(e.getSupplierno().equals(supplierno)) {
                e.setSuppliername(suppliername);
                e.setSuppliermanager(suppliermanager);
                e.setSuppliercontact(suppliercontact);
                e.setSuppliercontactphone(suppliercontactphone);
                e.setSupplieraddress(supplieraddress);

                int c = service.updateSupplier(e);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }




}
