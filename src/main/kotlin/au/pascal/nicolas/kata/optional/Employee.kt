package au.pascal.nicolas.kata.optional

import java.util.Optional

data class Employee(val name: String, val surname : String, val boss: Optional<Employee>)