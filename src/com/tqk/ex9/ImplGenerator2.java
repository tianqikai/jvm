package com.tqk.ex9;
/**
 *  实现泛型类
 */
public class ImplGenerator2<T> implements Generator{
    private  T  data;

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public T next() {
        return data;
    }

    public static void main(String[] args) {
        ImplGenerator2 implGenerator2=new ImplGenerator2();
        implGenerator2.setData("窝捏叠");
        System.out.println(implGenerator2.next());
    }
}
