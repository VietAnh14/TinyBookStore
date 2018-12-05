/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTPNDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class CTPNDAL extends ConnectDB {

    public boolean insertListCTPN(ArrayList<CTPNDTO> listCTPN) {
        boolean status;
        try {
            getConnection();
            Statement statement = cn.createStatement();
            cn.setAutoCommit(false);
            for (CTPNDTO ctpn : listCTPN) {
                statement.executeUpdate(ctpn.toInsertString());
            }
            cn.commit();
            status = true;
        } catch (SQLException e) {
            status = false;
            e.printStackTrace();
            try {
                cn.rollback();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        getClose();
        return status;
    }
}
