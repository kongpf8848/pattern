package io.github.kongpf8848.pattern.builder;

/**
 * Created by pengf on 2017/3/3.
 */
public class Student {

    private final int id;
    private final String name;
    private final String sex;
    private final String address;

    private Student(int id, String name, String sex, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
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


    public static class Builder {
        private int id;
        private String name;
        private String sex;
        private String address;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this.id, this.name,this.sex,this.address);

        }

    }
}
