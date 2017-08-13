package types

import model.Pizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class VeggiePizza : Pizza() {

	init {
		name = "Veggie Pizza"
		dough = "Crust"
		sauce = "Marinara sauce"
	}

}