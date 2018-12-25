/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.AccountDTO;
import DAL.AccountDAL;

/**
 *
 * @author Viet Anh
 */
public class AccountBLL {
    AccountDAL accountDAL = new AccountDAL();
    public Integer login(AccountDTO account) {
        return accountDAL.login(account);
    }
    public Boolean checkPass(Integer MaNV,String pass)
    {
        return accountDAL.checkLogin(MaNV, pass);
    }
    public Boolean suaPass(Integer MaNV,String pass)
    {
        return accountDAL.suaMatKhau(MaNV, pass);
    }
}
