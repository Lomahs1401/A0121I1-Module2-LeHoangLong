public class IllegalTriangleException extends Exception {
    private String msg;

    public IllegalTriangleException(String message) {
        this.msg = message;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
