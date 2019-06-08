package cn.itcast.domain;

import java.util.Date;

/**
 * @Author: yyb
 * @Date: 2019/5/30 15:23
 * @Description:
 */
public class User {
    private String uname;
    private Integer age;
    private Date date;

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User() {
    }



    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
