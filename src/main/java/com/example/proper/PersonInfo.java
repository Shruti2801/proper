package com.example.proper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class PersonInfo {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "photo_url")
    private String photoUrl;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "gender")
    private String gender;

    @Column(name = "phone_number1")
    private String phoneNumber1;
    @Column(name = "phone_number2")
    private String phoneNumber2;
    @Column(name = "email1")
    private String email1;
    @Column(name = "email2")
    private String email2;

//    @Column(name = "university_name")
//    private String universityName;
//    @Column(name = "university_degree")
//    private String degree;
//    @Column(name = "university_field_of_study")
//    private String fieldOfStudy;
//    @Column(name = "university_start_year")
//    private String universityStartYear;
//    @Column(name = "university_end_year")
//    private String universityEndYear;
//    @Column(name = "university_percentage")
//    private String universityPercentage;
//
//
//
//    @Column(name = "ptoject_name")
//    private String ptojectName;
//    @Column(name = "project_description")
//    private String projectDescription;
//    @Column(name = "project_role")
//    private String role;
//    @Column(name = "project_designation")
//    private String designation;
//    @Column(name = "project_start_year")
//    private String projectStartYear;
//    @Column(name = "project_end_year")
//    private String projectEndYear;
//    @Column(name = "project_technologies")
//    @ElementCollection
//    @OrderColumn(name = "pos")
//    private String[] technologies;
//
//
//    @Column(name = "government_identity")
//    private String governmentIdentity;
//
//
//    @Column(name = "houseNo")
//    private String houseNo;
//    @Column(name = "area")
//    private String area;
//    @Column(name = "landmark")
//    private String landmark;
//    @Column(name = "city")
//    private String city;
//    @Column(name = "pincode")
//    private String pincode;
//    @Column(name = "state")
//    private String state;
//    @Column(name = "country")
//    private String country;
//
//





}
