def runUnitTest() {
  def baseSricpt = getBase()
  baseSricpt.checkout()
  baseSricpt.build()

  println("invoke runUnitTest")
}

def exportReporter() {
  def baseSricpt = getBase()
  println("invoke exportReporter")
  baseSricpt.commit()
  baseSricpt.exportChangelog()
}

def getBase() {
  return fileLoader.fromGit('base_script.groovy', 'git@github.com:Huangtianhao/GitTest.git', 'master', '047190fb-4a69-4e2d-a6b7-2f56cb63ba2c', null)
}

return this
