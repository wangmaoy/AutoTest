public class ExcelVo {
    private  String  caseid;
    private  String execute_name;
    private  String execute_method;

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getExecute_name() {
        return execute_name;
    }

    public void setExecute_name(String execute_name) {
        this.execute_name = execute_name;
    }

    public String getExecute_method() {
        return execute_method;
    }

    public void setExecute_method(String execute_method) {
        this.execute_method = execute_method;
    }

    @Override
    public String toString() {
        return "ExcelVo{" +
                "caseid='" + caseid + '\'' +
                ", execute_name='" + execute_name + '\'' +
                ", execute_method='" + execute_method + '\'' +
                '}';
    }
}
