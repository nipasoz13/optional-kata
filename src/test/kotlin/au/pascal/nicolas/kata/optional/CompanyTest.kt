package au.pascal.nicolas.kata.optional

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import java.util.Optional
import kotlin.test.assertEquals

class CompanyTest: Spek({
    describe("getBossFullName") {
        it("should return Dilbert Foo for employee named Dilbert") {
            // Given
            val employeeName = "Dilbert"
            val expected = Optional.of("Dilbert Foo")

            // When
            val result = Company.getBossFullName(employeeName)

            // Then
            assertEquals(expected, result)
        }
    }
})