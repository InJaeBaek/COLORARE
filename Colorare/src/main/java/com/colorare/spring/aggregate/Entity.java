package com.colorare.spring.aggregate;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public abstract class Entity {
	
	protected String id;
	
	// id를 UUID로 설정
	protected Entity() {
		
		this.id = UUID.randomUUID().toString();
		
	}
	
	protected Entity(String id) {
		
		this.id = id;
		
	}
	

}
