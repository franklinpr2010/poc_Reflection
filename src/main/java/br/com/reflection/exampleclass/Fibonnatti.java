package br.com.reflection.exampleclass;

import java.util.HashSet;
import java.util.Set;

public class Fibonnatti {
	
	public static void main(String[] args) {
		System.out.println(findAllImplementedInterfaces(A.class));
	}
        
    /**
     * Returns all the interfaces that the current input class implements
     * Note: If the input is an interface, the method returns all the interfaces the 
     * input interfaces extends
     */
    public static Set<Class<?>> findAllImplementedInterfaces(Class<?> input) {
        Set<Class<?>> allImplementedInterfaces = new HashSet<>();
 
        Class<?>[] inputInterfaces = input.getInterfaces();
        for (Class<?> currentInterface : inputInterfaces) {
            allImplementedInterfaces.add(currentInterface);
            allImplementedInterfaces.addAll(findAllImplementedInterfaces(currentInterface));
        }
 
        return allImplementedInterfaces;
    }
}
