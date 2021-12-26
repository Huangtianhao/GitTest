jenkins_script() {
  println("create jenkins_script")
}

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
