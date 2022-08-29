package co.develhope.springrepositories02exercise.entities;

import javax.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String firstAppearance;

    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage(){}

    public ProgrammingLanguage(Long id, String name, String firstAppearance, String inventor){
        this.setId(id);
        this.setName(name);
        this.setFirstAppearance(firstAppearance);
        this.setInventor(inventor);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
