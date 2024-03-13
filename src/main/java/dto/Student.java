package dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String fullname;
private String fname;
private long mobile;
private String email;
private LocalDate dob;
private String gender;
private String course;
private String add;
@Lob
private byte[] picture;
private int age;

}
