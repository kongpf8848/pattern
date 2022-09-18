package io.github.kongpf8848.pattern.prototype;

import java.io.*;

/**
 * Created by pengf on 2017/3/9.
 */
public class NewPrototype implements Cloneable, Serializable {

    private String id;
    private Prototype prototype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public Object clone(){
        NewPrototype ret = null;
        try {
            ret = (NewPrototype)super.clone();
            ret.prototype = (Prototype)this.prototype.clone();
            return ret;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object deepClone()
    {
        try
        {
            ByteArrayOutputStream bo=new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return oi.readObject();
        }
        catch (IOException  | ClassNotFoundException e)
        {
             e.fillInStackTrace();
             return null;
        }
    }
}
