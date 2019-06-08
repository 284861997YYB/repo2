package cn.itcast.domain;

/**
 * @Author: yyb
 * @Date: 2019/5/30 15:24
 * @Description:
 */
public class Account {

    private User user;
    private  String  name;
    private  Integer age;

    public Account() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Account{" +
                "user=" + user +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Account(User user, String name, Integer age) {
        this.user = user;
        this.name = name;
        this.age = age;
    }
}
