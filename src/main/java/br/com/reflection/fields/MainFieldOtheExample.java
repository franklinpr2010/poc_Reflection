package br.com.reflection.fields;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Random;

abstract class Employee {
    public static final int SALARY_RANGE = 400;
    public static final int MIN_SALARY = 200;
 
    private final Random random = new Random();
 
    protected String firstName;
    protected String lastName;
    private int salary;
 
    protected Employee() {
        this.salary = MIN_SALARY + random.nextInt(SALARY_RANGE);
    }
 
    public String getFirstName() { return firstName; }
 
    public String getLastName() { return lastName; }
 
    public int getSalary() { return salary; }
 
    /**
     * Employee Builder class
     */
    public static class Builder {
        protected String builderFirstName;
        protected String builderLastName;
 
        public Builder setFirstName(String firstName) {
            this.builderFirstName = firstName;
            return this;
        }
 
        public Builder setLastName(String lastName) {
            this.builderLastName = lastName;
            return this;
        }
 
        public Employee build() {return new EmployeeImpl(); }
 
        /**
         * Concrete Employee implementation
         */
        private class EmployeeImpl extends Employee {
        	EmployeeImpl() {
                this.firstName = builderFirstName;
                this.lastName = builderLastName;
            }
        }
    }
    
}

 public class MainFieldOtheExample {
	public static void main(String[] args) {
		System.out.println(Employee.class.getDeclaredFields());
		
		Field[] declaredFields = Employee.class.getDeclaredFields();
	    for (Field field : declaredFields) {
	    	System.out.println("getDeclaredFields: " + field.getName());
		}
	    
	    System.out.println("********************************************");
	    
		Field[] fields = Employee.class.getFields();
	    for (Field field : fields) {
	    	System.out.println("getFields: " + field.getName());
		}
	}
}
