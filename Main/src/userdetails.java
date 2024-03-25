public class userdetails {
    private  String u_name;
    public   String getU_name() {
        return u_name;
    }
    public  void setU_name(String u_name) {
        this.u_name = u_name;
    }
    private  int u_id;
    public  int getU_id() {
        return u_id;
    }
    public void setU_id(int u_id) {
        this.u_id = u_id;
    }
    private String u_city;
    public String getU_city() {
        return u_city;
    }
    public void setU_city(String u_city) {
        this.u_city = u_city;
    }
    private String u_mobno;
    public String getU_mobno() {
        return u_mobno;
    }
    public void setU_mobno(String u_mobno) {
        this.u_mobno = u_mobno;
    }
    private String u_mail;
    public String getU_mail() {
        return u_mail;
    }
    public void setU_mail(String u_mail) {
        this.u_mail = u_mail;
    }
    public userdetails(String u_name, int u_id, String u_city, String u_mobno, String u_mail) {
        this.u_name = u_name;
        this.u_id = u_id;
        this.u_city = u_city;
        this.u_mobno = u_mobno;
        this.u_mail = u_mail;
    }

    public userdetails(String use_name)
    {
        this.u_name= use_name;
    }
  

}
