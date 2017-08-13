import factory.SimplePizzaFactory
import model.Pizza
import store.PizzaStore

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

fun main(args: Array<String>) {

	val factory: SimplePizzaFactory = SimplePizzaFactory()
	val store: PizzaStore = PizzaStore(factory)

	var pizza: Pizza? = store.orderPizza("cheesse" )
	println("We ordered a ${pizza?.name}")
	println("---------------------------")

	pizza = store.orderPizza("veggie" )
	println("We ordered a ${pizza?.name}")
	println("---------------------------")

}