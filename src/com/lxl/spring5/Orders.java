package com.lxl.spring5;

/**
 * 使用有参数构造注入
 */
public class Orders {
    //属性
    private String oname;
    private String address;

    //有参数构造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ShowOrder() {
        System.out.println(oname+"::"+address);
    }
}
