package ma.fstt.Clustuering.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.AUTO;


@Document
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Client {

    @Id @GeneratedValue(strategy =  AUTO)
    private String _id;
    @Field
    private String sex;
    @Field
    private String smoker;
    @Field
    private String region;
    @Field
    private int age;
    @Field
    private int BMI;
    @Field
    private int children;
    @Field
    private int cluster ;
    @Field
    private double expenses ;
}
