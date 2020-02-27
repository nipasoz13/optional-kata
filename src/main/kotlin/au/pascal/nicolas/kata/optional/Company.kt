package au.pascal.nicolas.kata.optional

import java.util.Optional

object Company {
    private val boss = Employee("Pointed Hairy", "Boss", Optional.empty())
    private val dilbert = Employee("Dilbert", "Foo", Optional.of(boss))

    val employees: MutableList<Employee> = mutableListOf(dilbert, boss)

    private fun findEmployee(name: String): Optional<Employee> =
        employees
            .find { e -> e.name == name }
            .let { e -> Optional.ofNullable(e) }

    private fun hireEmployee(newEmployee: String) {
        employees.add(Employee(newEmployee, "Foo", Optional.of(boss)))
    }

    fun getBossFullName(employeeName: String): Optional<String> = TODO()

    fun hireIfNotAlreadyEmployed(newEmployee: String): Optional<Employee> = TODO()
}