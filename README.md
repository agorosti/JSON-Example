# JSON-Example
Example of JSON import/export using GSON library
Computer Science Project I
Teacher:  Andres.Gorostidi@universidadeuropea.es

---

# Project Overview

This project demonstrates the use of the Gson library in Java to handle JSON serialization and deserialization of an array of `Employee` objects. The code provides a `GsonArrayHandler` class with methods to convert (serialize) an array of `Employee` instances into JSON format and save it to a file, as well as to read (deserialize) the JSON data back into an array of `Employee` objects.

## Functionality

The main functionality includes:

1. **Serialization**: Converting an array of `Employee` objects into JSON format and saving the JSON data to a file named `employees.json`.
2. **Deserialization**: Reading the JSON data from `employees.json` and reconstructing it back into an array of `Employee` objects.

## Code Structure

### Class `GsonArrayHandler`

The `GsonArrayHandler` class contains two main methods:

- **`serializeArrayToJson()`**: Creates sample `Employee` objects, converts them to JSON, and writes the JSON data to a file (`employees.json`).
- **`deserializeJsonToArray()`**: Reads the `employees.json` file and converts the JSON data back into an array of `Employee` objects.

### Main Method (`main`)

The `main` method demonstrates the workflow:

1. **Create Instance**: Instantiates `GsonArrayHandler` to manage JSON operations.
2. **Serialize**: Calls `serializeArrayToJson()` to create the JSON file with employee data.
3. **Deserialize**: Calls `deserializeJsonToArray()` to read the JSON file and reconstruct the employee array.
4. **Print Employees**: Retrieves the deserialized employee objects and displays them in the console.

## Methods Explanation

### `serializeArrayToJson()`

1. **Create Employee Objects**: Creates three sample `Employee` objects with basic data (ID, name, country).
2. **Add to Vector**: Adds these employees to a `Vector<Employee>`.
3. **Convert to JSON**: Uses Gson with `PrettyPrinting` to format JSON, making it easy to read. The JSON data is also printed to the console.
4. **Write to File**: Writes the formatted JSON data to `employees.json`.

### `deserializeJsonToArray()`

1. **Read JSON File**: Opens `employees.json` using a `FileReader`.
2. **Convert JSON to Array**: Uses Gson to convert the JSON back into a `Vector<Employee>`, specifying the exact type (`Vector<Employee>`) through `TypeToken`.
3. **Return Result**: Returns the `Vector<Employee>` with the deserialized employee objects.

## Example Output

When the code is run, it prints the JSON data and deserialized employee information in the console, showing the successful conversion between objects and JSON format.

## Requirements

- **Gson Library**: Ensure the Gson library is included in the project dependencies.

## How to Use

1. Clone or download the project.
2. Make sure to include Gson in your project dependencies.
3. Compile and run the `GsonArrayHandler` class to see the serialization and deserialization in action.

This code demonstrates how easy it is to serialize and deserialize Java objects to and from JSON format using Gson, making it useful for projects that need to save, transfer, or work with JSON data.

--- 
