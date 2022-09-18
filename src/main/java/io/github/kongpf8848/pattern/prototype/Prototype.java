package io.github.kongpf8848.pattern.prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengf on 2017/3/9.
 */
public class Prototype implements Cloneable,Serializable {
    private String text;
    private ArrayList<String> images=new ArrayList<>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }
    public void addImage(String img) {
        images.add(img);
    }

    @Override
    public Prototype clone() {

        try {
            Prototype p= (Prototype) super.clone();
            p.text=this.text;
            //深Copy
            p.images=(ArrayList<String>) this.images.clone();
            return p;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;

    }

    public void show(){
        System.out.println("---Word content start---");
        System.out.println("Text : " + text);
        System.out.println("images list : ");
        for (String name : images) {
            System.out.println("image name : " + name);
        }
        System.out.println("---Word content end---");
    }


}
