package model

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

abstract class Pizza {

	lateinit var name: String
	lateinit var dough: String
	lateinit var sauce: String

	fun prepare() {
		println("Preparing $name")
	}

	fun bake() {
		println("Baking $name")
	}

	fun cut() {
		println("Cutting $name")
	}

	fun box() {
		println("Boxing $name")
	}

}