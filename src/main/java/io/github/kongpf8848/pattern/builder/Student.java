package io.github.kongpf8848.pattern.builder;

/**
 * Created by pengf on 2017/3/3.
 */
public class Student {

    private int id;
    private String name;
    private String sex;
    private String address;

    private Student()
    {

    }
    private Student(Student s)
    {
        this.id=s.id;
        this.name=s.name;
        this.sex=s.sex;
        this.address=s.address;
    }
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }



    public static class Builder
    {
        private Student target;
        public Builder()
        {
            target=new Student();
        }

        public Builder id(int id)
        {
            target.id=id;
            return this;
        }
        public Builder name(String name)
        {
            target.name=name;
            return this;
        }
        public Builder sex(String sex)
        {
            target.sex=sex;
            return this;
        }
        public Builder address(String address)
        {
            target.address=address;
            return this;
        }

        public Student build()
        {
            return new Student(target);

        }

    }
}
