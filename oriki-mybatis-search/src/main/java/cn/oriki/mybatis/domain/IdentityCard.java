package cn.oriki.mybatis.domain;

public class IdentityCard {
    private Integer id;
    private String idNumber;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public IdentityCard(Integer id, String idNumber) {
        this.id = id;
        this.idNumber = idNumber;
    }

    public IdentityCard() {

    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "id=" + id +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
