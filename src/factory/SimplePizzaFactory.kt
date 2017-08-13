package factory

import model.Pizza
import types.CheessePiza
import types.ClamPizza
import types.PepperoniPizza
import types.VeggiePizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class SimplePizzaFactory {

	fun createPizza(type: String) : Pizza? {
		var pizza: Pizza? = null

		when (type) {
			"cheesse" -> pizza = CheessePiza()
			"pepperoni" -> pizza = PepperoniPizza()
			"clam" -> pizza = ClamPizza()
			"veggie" -> pizza = VeggiePizza()
		}

		return pizza
	}

}