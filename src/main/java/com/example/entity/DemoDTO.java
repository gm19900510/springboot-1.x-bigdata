package com.example.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class DemoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int s1;
	private String s2;
	private String s3;
	private String s4;
}
