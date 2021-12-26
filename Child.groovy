class Child extends Base {
	
	@Override
    def run() {
	    println("invoke run")
		super.run()
	}
}

class Base {

    def run() {
	    println("base run")
	}
}