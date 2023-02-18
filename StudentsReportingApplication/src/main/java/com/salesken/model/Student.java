package com.salesken.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Data
@Document(indexName="students")
public class Student {

	@Id
	private Long roll;
	@Field(type = FieldType.Text,name = "name")
	private String name;
	@Field(type = FieldType.Text,name = "address")
	private String address;
	
	@Field(type = FieldType.Object)
	private Marks marks;
	
}
