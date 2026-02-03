# Algorithms - Multi-Module Maven Project

Implementation of basic algorithms in Java organized as a multi-module Maven project.

## Project Structure

This is a Maven multi-module project with the following structure:

```
algorithms-parent (root)
├── binarySearch
├── bubbleSort
├── linearSearch
├── mergeSort
├── quickSort
├── recursion
└── selectionSort
```

## Modules

### 1. Binary Search
Implementation of binary search algorithm for sorted arrays.
- **Main Class**: `com.codeprep.binarysearch.BinarySearch`

### 2. Bubble Sort
Implementation of bubble sort algorithm.
- **Main Class**: `com.codeprep.bubblesort.BubbleSort`

### 3. Linear Search
Multiple implementations of linear search algorithms:
- Basic linear search
- Linear search with sentinel
- Linear search on sorted arrays
- **Main Class**: `com.codeprep.linearsearch.LinearSearch`

### 4. Merge Sort
Implementations of merge sort algorithm:
- Recursive merge sort
- Iterative merge sort
- Merging sorted arrays
- **Main Class**: `com.codeprep.mergesort.recursive.MergeSortRecursive`

### 5. Quick Sort
Implementation of quick sort algorithm.
- **Main Class**: `com.codeprep.quicksort.Solution`

### 6. Recursion
Examples of recursion:
- Factorial using recursion
- Printing numbers 1 to N
- Sum of digits
- **Main Class**: `com.codeprep.factorial.FactorialUsingRecursion`

### 7. Selection Sort
Implementation of selection sort algorithm.
- **Main Class**: `com.codeprep.selectionsort.SelectionSort`

## Building the Project

### Build All Modules
```bash
mvn clean install
```

### Build a Specific Module
```bash
mvn clean install -pl <module-name>
```

For example:
```bash
mvn clean install -pl binarySearch
```

### Compile All Modules
```bash
mvn clean compile
```

## Running the Algorithms

### Using Maven Exec Plugin

To run a specific module's main class:

```bash
mvn exec:java -pl <module-name>
```

Examples:

**Binary Search:**
```bash
mvn exec:java -pl binarySearch
```

**Quick Sort:**
```bash
mvn exec:java -pl quickSort
```

**Merge Sort (Recursive):**
```bash
mvn exec:java -pl mergeSort
```

### Using Java Command

After building, you can run compiled classes directly:

```bash
java -cp <module-name>/target/classes com.codeprep.<package>.<MainClass>
```

Example:
```bash
java -cp binarySearch/target/classes com.codeprep.binarysearch.BinarySearch
```

## Maven Coordinates

- **Group ID**: `com.codeprep`
- **Parent Artifact ID**: `algorithms-parent`
- **Version**: `1.0.0-SNAPSHOT`

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Project Properties

- **Source Encoding**: UTF-8
- **Java Version**: 11
- **Maven Compiler Source**: 11
- **Maven Compiler Target**: 11

## Module Dependencies

Each module is independent and can be built/run separately. There are no inter-module dependencies.

## Contributing

When adding new algorithm implementations:
1. Create a new module directory
2. Add the module to the parent `pom.xml` in the `<modules>` section
3. Create a `pom.xml` for the new module with proper parent reference
4. Follow the standard Maven directory structure: `src/main/java`
5. Configure the exec-maven-plugin with the main class if the module is executable

## License

See LICENSE file for details.
