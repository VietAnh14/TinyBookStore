# TinyBookStore
Java school project

#### Add new form to main form
* Create an event click on button panel
* Reset button panel color in resetColor method
```     
public void resetColor() {
          btnQuanLySach.setForeground(new Color(204, 204, 204));
          btnQLPhieuNhap.setForeground(new Color(204, 204, 204));
          btnQLGiDo.setForeground(new Color(204, 204, 204));
     }
```
* Using swichPanel method to change the panel form of the main form
```
    private void btnQuanLySachMouseClicked(java.awt.event.MouseEvent evt) {                                           
        fQuanLySach qlSach = new fQuanLySach();
        resetColor();
        btnQuanLySach.setForeground(Color.WHITE);
        swichPanel(qlSach);
    }   
```
###### Icon used in project belong to
www.flaticon.com 
