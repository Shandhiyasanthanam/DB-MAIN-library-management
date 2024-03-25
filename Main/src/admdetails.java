public class admdetails {
    private int adm_id;
    public int getAdm_id() {
        return adm_id;
    }
    public void setAdm_id(int adm_id) {
        this.adm_id = adm_id;
    }
    private String adm_name;
    public String getAdm_name() {
        return adm_name;
    }
    public void setAdm_name(String adm_name) {
        this.adm_name = adm_name;
    }
    private String adm_mail;
    public String getAdm_mail() {
        return adm_mail;
    }
    public void setAdm_mail(String adm_mail) {
        this.adm_mail = adm_mail;
    }
    public admdetails(int adm_id, String adm_name, String adm_mail) {
        this.adm_id = adm_id;
        this.adm_name = adm_name;
        this.adm_mail = adm_mail;
    }

}
