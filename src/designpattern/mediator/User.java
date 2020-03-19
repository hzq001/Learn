package designpattern.mediator;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class User {

    private String name;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sendMessage(String message) {
        ChatRoom.showMessage(this,message);
    }
}
