/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Windows
 */
public class Parent {
    //Cha tạo dựng 2 món đồ, 2 tài sản
    protected String assetOne;  //biệt thự
    protected String assetTwo;  //100BTC

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parent{assetOne=").append(assetOne);
        sb.append(", assetTwo=").append(assetTwo);
        sb.append('}');
        return sb.toString();
    }
    public void showProfile() {
        System.out.println("PARENT > asset1: " + assetOne + " asset2: " + assetTwo);
    }
}
