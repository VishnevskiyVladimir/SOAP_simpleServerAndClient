How to run:
1. Run server (Enable Lombok Annotation processing in IDE)
2. Find in browser:

    http://localhost:8080/employeeservice?wsdl

    http://localhost:8080/employeeservice?xsd=1
3. run in terminal from client module to generate source files:

   wsimport -keep -verbose -s ./src/main/java  http://localhost:8080/employeeservice?wsdl
4. Add @ToString to Employee and Company classes
5. Run client