package com.tqk.ex9;

public class ImplGenerator<T> {
    private  T  data;

    public void setData(T data) {
        this.data = data;
    }
    public T next() {
        return data;
    }
    public static void main(String[] args) {
        ImplGenerator2 implGenerator2=new ImplGenerator2();
        implGenerator2.setData("窝 嫩 寝 叠");
        System.out.println(implGenerator2.next());
    }
}
