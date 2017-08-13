package store

import factory.SimplePizzaFactory
import model.Pizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class PizzaStore(factory: SimplePizzaFactory) {

	val factory: SimplePizzaFactory

	init {
		this.factory = factory
	}

	fun orderPizza(type: String) : Pizza? {
		val pizza: Pizza?

		pizza = factory.createPizza(type)

		pizza?.prepare()
		pizza?.bake()
		pizza?.cut()
		pizza?.box()

		return pizza
	}

}