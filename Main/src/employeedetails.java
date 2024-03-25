public class employeedetails {
    private String staff_name;
    public String getStaff_name() {
        return staff_name;
    }
    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }
    private int staff_id;
    public int getStaff_id() {
        return staff_id;
    }
    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }
    public employeedetails(String staff_name, int staff_id) {
        this.staff_name = staff_name;
        this.staff_id = staff_id;
    }
    public employeedetails(int emp_id)
    {
        this.staff_id=emp_id;
    }
    
}
