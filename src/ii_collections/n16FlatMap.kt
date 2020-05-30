package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product>
    get() {
        return this.orders.map { it.products }.flatten().toSet()
    }

val Shop.allOrderedProducts: Set<Product>
    get() {
        return this.customers.map { it.orders }.flatten().map { it.products }.flatten().toSet()
    }
