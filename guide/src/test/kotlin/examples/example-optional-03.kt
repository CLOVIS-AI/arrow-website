// This file was automatically generated from optional-prism.md by Knit tool. Do not edit.
package arrow.website.examples.exampleOptional03

import io.kotest.matchers.shouldBe


import arrow.optics.*
import arrow.optics.dsl.*
import arrow.optics.typeclasses.*

@optics data class Db(val cities: Map<String, City>) {
  companion object
}
@optics data class City(val name: String, val country: String) {
  companion object
}

val db = Db(mapOf(
  "Alejandro" to City("Hilversum", "Netherlands"),
  "Ambrosio"  to City("Ciudad Real", "Spain")
))

fun example() {
  val dbWithJack = Db.cities.modify(db) { it + ("Jack" to City("London", "UK")) }
  // now Jack is finally in the database
  ("Jack" in dbWithJack.cities) shouldBe true
}