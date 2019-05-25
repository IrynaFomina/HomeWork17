package part2;

public class Worker {
    private String login;
    private String position;
    private String company;
    private int sinceYear;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSinceYear(int sinceYear) {
        this.sinceYear = sinceYear;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "login='" + login + '\'' +
                ", position='" + position + '\'' +
                ", company='" + company + '\'' +
                ", sinceYear=" + sinceYear +
                '}';
    }
}
