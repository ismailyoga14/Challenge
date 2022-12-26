class Cat(s: String) : AnimalAbstract() {
    override fun voice() {
        println("Meow..")
    }

    override fun voice(name: String) {
        println("Meow.. nama kucing $name")
    }

//    override fun voice(age: Int) {
//        println("Meow.. umur kucing $age")
//    }
//
//    override fun voice(name: String, age: Int) {
//        println("Meow.. nama kucing $name & umur kucing $age")
//    }
}