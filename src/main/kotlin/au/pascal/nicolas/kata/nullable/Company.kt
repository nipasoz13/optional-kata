package au.pascal.nicolas.kata.nullable

import java.util.Optional

object Company {
    private val boss = Employee("Pointed Hairy", "Boss", null)
    private val dilbert = Employee("Dilbert", "Foo", boss)

    val employees: MutableList<Employee> = mutableListOf(dilbert, boss)

    fun findEmployee(name: String): Employee? = employees.find { e -> e.name == name }

    fun getBossFullName(employeeName: String): Optional<String> = TODO()

    fun hireIfNotAlreadyEmployed(newEmployee: String): Employee? = TODO()

    private fun hireEmployee(newEmployee: String) {
        employees.add(Employee(newEmployee, "Foo", boss))
    }
}