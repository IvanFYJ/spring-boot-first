package top.fanyongjian.springdatajpa.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Administrator
 */
@Entity
@Table(name="T_USER")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class User {


    @Id
/*    @GenericGenerator(name = "idg",strategy = "uuid")
    @GeneratedValue(generator = "idg")*/
    @Column(name = "USER_ID")
    private  String userId;

    @Column(name = "USERNAME")
    private  String username;

    @Column(name = "PASSWORD")
    private  String password;

    @Column(name = "PHONE_NUM")
    private  String mobileNum;

    @Column(name = "Create_Date")
    private  String createTime;

    /* Getter & Setter .. */

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public User() {
    }

    public User(String userId, String username, String password, String mobileNum) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.mobileNum = mobileNum;
    }
}
