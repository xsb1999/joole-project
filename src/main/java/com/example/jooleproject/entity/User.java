package com.example.jooleproject.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@GenericGenerator(name = "user-uuid", strategy = "uuid")
@Table(name = "user", schema = "joole", catalog = "")
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
//    @GeneratedValue(generator = "user-uuid")
    @Column(name = "user_name", nullable = false, length = 100)
    private String userName;
    @Basic
    @Column(name = "user_type", nullable = true, length = 50)
    private String userType;
    @Basic
    @Column(name = "user_password", nullable = true, length = 100)
    private String userPassword;
    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    List<Project> projectList = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userType='" + userType + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", projectList=" + projectList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(userType, user.userType) && Objects.equals(userPassword, user.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userType, userPassword);
    }
}
