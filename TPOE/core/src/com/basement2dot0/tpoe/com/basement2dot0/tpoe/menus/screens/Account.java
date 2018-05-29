package com.basement2dot0.tpoe.com.basement2dot0.tpoe.menus.screens;

public class Account
{
    private String username;
    private String password;
    private String confirmPassword;
    private String email;

    public Account()
    {

    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getConfirmPassword()
    {
        return confirmPassword;
    }

    public String getEmail()
    {
        return email;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public void setConfirmPassword (String confirmPassword)
    {
        this.confirmPassword = confirmPassword;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

}
