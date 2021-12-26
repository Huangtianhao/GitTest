def baseSricpt

def jenkins_script() {
  println("create jenkins_script")
}

def runUnitTest() {
  def baseSricpt = fileLoader.fromGit('base_script.groovy', 'git@github.com:Huangtianhao/GitTest.git', 'master', '047190fb-4a69-4e2d-a6b7-2f56cb63ba2c', null)
  baseSricpt.checkout()
  baseSricpt.build()

  println("invoke runUnitTest")
}

def exportReporter() {
  println("invoke exportReporter")
  baseSricpt.commit()
  baseSricpt.exportChangelog()
}
def initBase() {
  if(baseSricpt == null) {
    println("init baseSricpt")
    baseSricpt = fileLoader.fromGit('base_script.groovy', 'git@github.com:Huangtianhao/GitTest.git', 'master', '047190fb-4a69-4e2d-a6b7-2f56cb63ba2c', null)
  }
}
return this
