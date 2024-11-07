import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Vector;

public class gsonArray {

	public static void main(String[] args) {
		gsonArray jsonHandler = new gsonArray();

		// Serialize the employee array to JSON
		jsonHandler.serializeArrayToJson();

		// Deserialize JSON back into an employee array
		Vector<Employee> employees = jsonHandler.deserializeJsonToArray();

		// Retrieve and display each employee
		Employee employee1 = employees.get(0);
		Employee employee2 = employees.get(1);
		Employee employee3 = employees.get(2);

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

	public void serializeArrayToJson() {
		// Creating employee objects with example data
		Employee employee1 = new Employee(46, "Maria", "Autentia");
		Employee employee2 = new Employee(33, "Pierre", "France");
		Employee employee3 = new Employee(25, "Sara", "El Rosario");

		// Adding employees to the vector
		Vector<Employee> employees = new Vector<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		// Convert the vector to JSON with pretty formatting
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String prettyRepresentation = prettyGson.toJson(employees);
		System.out.println(prettyRepresentation);

		// Write JSON to file using FileWriter with automatic resource management
		try (FileWriter writer = new FileWriter("employees.json")) {
			prettyGson.toJson(employees, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Vector<Employee> deserializeJsonToArray() {
		Vector<Employee> employees = new Vector<Employee>();

		// Read JSON from file and convert to a vector of Employee objects
		try (Reader reader = new FileReader("employees.json")) {
			Gson gson = new Gson();
			Type employeeListType = new TypeToken<Vector<Employee>>(){}.getType();
			employees = gson.fromJson(reader, employeeListType);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return employees;
	}
}

