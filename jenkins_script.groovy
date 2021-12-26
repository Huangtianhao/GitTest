def runUnitTest() {
  baseSricpt.checkout()
  baseSricpt.build()

  println("invoke runUnitTest")
}

def exportReporter() {
  println("invoke exportReporter")
  baseSricpt.commit()
  baseSricpt.exportChangelog()
}
return this
