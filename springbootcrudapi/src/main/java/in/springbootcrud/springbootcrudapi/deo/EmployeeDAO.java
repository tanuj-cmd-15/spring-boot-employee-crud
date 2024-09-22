package in.springbootcrud.springbootcrudapi.deo;

import java.util.List;

import in.springbootcrud.springbootcrudapi.model.*;

public interface EmployeeDAO {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
