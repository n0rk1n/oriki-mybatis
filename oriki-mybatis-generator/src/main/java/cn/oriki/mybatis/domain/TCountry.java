package cn.oriki.mybatis.domain;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_country
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class TCountry {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_country.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_country.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_country.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_country.id
     *
     * @return the value of t_country.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_country.id
     *
     * @param id the value for t_country.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_country.name
     *
     * @return the value of t_country.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_country.name
     *
     * @param name the value for t_country.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_country.code
     *
     * @return the value of t_country.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_country.code
     *
     * @param code the value for t_country.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}