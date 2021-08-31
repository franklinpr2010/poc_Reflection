package br.com.reflection.anottationbasic;


import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class TheClass {





public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
	/*
	 * Class d = DataBean.class;
	 * 
	 * Field fs[] = d.getFields(); for (Field f : fs) { System.out.println(f);
	 * 
	 * Annotation a = f.getAnnotation(DataField.class);
	 * 
	 * 
	 * 
	 * //Object object = f.get(b);
	 * 
	 * if (a != null) { System.out.println(f.getName());
	 * 
	 * 
	 * } }
	 */
	
	
	DataBean dataBean = new DataBean();
	dataBean.setData("valor");
	dataBean.setDescription("description");
	dataBean.setData("data");
	Teste teste = new Teste();
	teste.setDescricao("teste");
	List<Teste> testes = new ArrayList<Teste>();
	testes.add(teste);
	dataBean.setTestes(testes);

	
	Class clazz = dataBean.getClass();
	Field[] fld = clazz.getDeclaredFields();
	
	for (int i = 0; i < fld.length; i++) {
		Field field = fld[i];
		field.setAccessible(true);
		
		if(field.getName().equals("description")) {
			System.out.println(field.get(dataBean));
			
		}
		
		if(field.getName().equals("testes")) {
			@SuppressWarnings("unchecked")
			List<Teste> teste12343 = (List<Teste>)field.get(dataBean);
			if(field.get(dataBean) instanceof List) {
				teste12343.stream().forEach(lista2 -> {
					List<Field> fields = new ArrayList<Field>(Arrays.asList(lista2.getClass().getDeclaredFields()));
					fields.stream().forEach(campo -> {
					
						
						
					});
					
					//for (int j = 0;j < tes.length; j++) {
					//	Field field2 = tes[j];
					//if(field2.getName().equals("descricao")) {
					//	field2.setAccessible(true);
					//	try {
					//		System.out.println(field2.get(lista2));
					//	} catch (IllegalArgumentException e) {
					//	} catch (IllegalAccessException e) {
					//	}
					//}
					//}
					
				});
			}
			
			
			
		}
		
		
		
	}
	

	
	
	
	
	
  }
}